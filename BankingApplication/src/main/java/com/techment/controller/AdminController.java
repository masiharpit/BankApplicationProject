package com.techment.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.techment.entity.Admin;
import com.techment.service.AdminService;
@Controller
public class AdminController {
	
	@Autowired
	private AdminService adminservice;

	@PostMapping("/admin")	
	public String user(@RequestBody Admin admin) {
		
		String output =adminservice.AddAdmin(admin);
		return output; 

       }

}
