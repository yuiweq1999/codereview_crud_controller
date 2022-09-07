package com.fstop.test.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

//新增值的方法

import com.fstop.test.entity.crudEntity;
import com.fstop.test.service.crudService;


//lombak 這邊使用要注意叫進來的是不是對的東西@@
import lombok.extern.slf4j.Slf4j;

//import io.swagger.v3.oas.annotations.tags.Tag;

@Controller
@RequestMapping("/fstop")
//先建立首頁的RequestMapping
//RequestMapping指的路徑不能跟其他 annotation重複,重複就會開不起來

//@Tag(name = "Example API", description = "Example API")

@Slf4j
//lombak的annotation


public class crudController {
	@Autowired
	crudService crudEntityS;
	//這邊先做頁面,因為正常來說應該是要在templates去連HTML,不過這邊先用JSP裡面去寫HTML來連線
	private String message="Pages";
	
	//Get資料
	@GetMapping("/index")
	public String index(Map<String,Object>model) {
		log.info("測試 Controller");
		this.message="輸入頁";
		model.put("message",this.message);
		return "index";
	}
	
	//新增
	@PostMapping("/create")
	//按下confirm後
	//因為我這邊要傳的值是1個id與4個string 的值
	public String createUser(@RequestParam Map<String, Object> model, Map<String,Object> map) {
//		這邊我要有id username password email 所以是 int string string string
		
		log.info("create");
//		System.out.println(model.get("Id"));
		this.message="確定新增?";
		map.put("message",this.message);
		map.put("Id",model.get("Id"));
		map.put("username",model.get("username"));
		map.put("password",model.get("password"));
		map.put("email", model.get("email"));
		return "create";
	}
	
	
	//儲存確認
	@PostMapping("/end")
//	public String saveCrud(@RequestParam String Id,String username ,String email,String password,Map<String, Object>map)
	
	public String saveCrud(@RequestParam Map<String, Object>model,Map<String, Object>map){
		log.info("end");
		this.message = "建立儲存成功";
//		crudEntity crudnew = new crudEntity((String)model.get("Id"),(String)model.get("username"),(String)model.get("email"),(String)model.get("password"));
		//這邊要注意建構子引數,因為我發現我沒有使用@AllArgsConstructor,@NoArgsConstructor就會沒辦法呼叫這些引數
//		
		String y = (String) model.get("Id");
		String y2 = (String) model.get("username");
		String y3 = (String) model.get("email");
		String y4 = (String) model.get("password");
			
		
//		
		crudEntity x =new crudEntity();
		x.setId(y);
		x.setUsername(y2);
		x.setEmail(y3);
		x.setPassword(y4);
		log.info(x.toString());
		crudEntityS.createUser(x);		
		
		List<crudEntity> list = crudEntityS.getcrudList();
		map.put("message", this.message);
		map.put("list", list);
		log.info(list.toString());
		return "end";
	}
	

	//修改
	@PostMapping("/update/{Id}")
	public String updateUser(@PathVariable("Id") String crud, Map<String, Object>map) {
		log.info("update");
		this.message="修改確認";
		
		crudEntity list =crudEntityS.getCrudId(crud);
		map.put("message",this.message);
		map.put("Id",list.getId());
		map.put("username",list.getUsername());
		map.put("email",list.getEmail());
		map.put("password",list.getPassword());
		return "update";
	}
	
	
	//刪除
	@PostMapping("/delete/{Id}")
	public String deleteCrud(@PathVariable("Id") String Id, Map<String, Object> map) {
		log.info("刪除資料");
		crudEntityS.deleteCrud(Id);
		List<crudEntity> list = crudEntityS.getcrudList();
		map.put("message", list);
		return "end";
	}
	

	
	//查詢
	@PostMapping("/all")
	public String allCrud(@RequestParam Map<String, Object>model,Map<String, Object>map) {
		log.info("end");
		this.message=("所有資料");
		List<crudEntity> list = crudEntityS.getcrudList();
		map.put("message",this.message);
		map.put("list",list);
		return "end";
	}

}


