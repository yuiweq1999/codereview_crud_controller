package com.fstop.test.service;

import java.util.List;
//import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//這邊要叫Autowired跟Service功能來用

import com.fstop.test.dao.crudDao;
import com.fstop.test.entity.crudEntity;

@Service
//取ID
public class crudService {
	@Autowired
	private crudDao cruddao;
	
	//找全部的查詢
	public List<crudEntity> getcrudList() {
		return cruddao.findAll();
	}

	
//	找id的查詢
//	public crudEntity getCrudData(String Id) {
//		Optional<crudEntity> stu = cruddao.findById(Id);
//		//不要忘記回傳值
//		return stu.get();
//	}
	
	//找id的查詢
	public crudEntity getCrudId(String id) {
		return cruddao.getById(id);
	}
	
	//儲存
	public crudEntity createUser(crudEntity crudEntity) {
		return cruddao.save(crudEntity);
	}
	
	//更新
//	public String upDateUser(String crudEntity) {
////		crudEntity crudEntity = getCrudId(Id);
//		cruddao.save(crudEntity);
//		return "Ok";
//	}
	
	//更新資料
	public String upDateUser(crudEntity crudEntity) {
		cruddao.save(crudEntity);
		return "OK";
	}
	

	
	//刪除
	public String deleteCrud(String id) {
//		crudEntity crudEntity = getCrudId(id);
		cruddao.deleteById(id);
		return "ok";
	}
	
	
	
}
