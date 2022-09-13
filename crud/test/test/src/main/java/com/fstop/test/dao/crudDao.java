package com.fstop.test.dao;


//import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstop.test.entity.crudEntity;

@Repository
public interface crudDao extends JpaRepository<crudEntity, String>{
	//要注意int的大寫型別(忘記正確名稱)是Integer
	crudEntity findByUsername(String username);
	//spring因為有自定義fucntion 所以其實他是findBy{$} 功能,所以要大寫把明確的型態名稱寫進來
}
