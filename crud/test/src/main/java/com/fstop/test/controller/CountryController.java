package com.fstop.test.controller;


import java.util.Map;

//import org.springframework.beans.factory.annotation.Autowired;
//這支不會過,不要import近來
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstop.test.entity.country;
import com.fstop.test.service.CountryService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@Controller
//這邊要注意不要用RestController
//@RequestMapping("/fstop")
//注意RequestMapping annotation不可以重複指
//1.路徑要注意,我的預設是/fstop
@Tag(name = "Example API", description = "Example API")
@Slf4j
public class CountryController {

//	@Autowired
//	CountryService examS;
//	CountryService examS這行不知道可以幹嘛
	private String message="Pages";
	CountryService countryS;
	
	
//    @GetMapping("/{numbers}")
//    public country query(@PathVariable int numbers) {
//    	country result=this.countryS.getCountryData(numbers);
//    	return result;
    	
    @GetMapping("/index")
    public String index(Map<String,Object>model) {
    	//因為用了GetMapping的annotation,我們建立一個index (並取引數model以map型別找所有的物件(其實就是找
//    	???
    	log.info("TEST controller");
    	this.message="輸入頁";
    	model.put("message", this.message);
    	return "test";
    }
    
    
}
