package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.controller.domain.DataOutput;
import com.controller.domain.DogObject;
import com.dao.domain.UserObject;
import com.service.DemoService;

@Controller
public class DemoController {
	
	@Autowired
	DemoService demoService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public DataOutput<DogObject> hello(){
		System.out.println("Helo");
		UserObject user = demoService.getUserById(1);
		
		System.out.println(user.getId()+"");
		
		DogObject dog2 = new DogObject();
		dog2.setName("vvi");
		DataOutput<DogObject> data = new DataOutput<DogObject>();
		data.setCode("200");
		data.setMsg("fail");
		data.setData(dog2);
		return data;
	}
	
	public static void main(String[] args) {
		System.out.println("Heelo");
	}
}
