package com.techment.Controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import com.techment.Entity.User;
import com.techment.Service.IUserService;
import com.techment.Service.UserService;
import com.techment.dto.Userdto;


@Controller
public class UserController {
	
	@Autowired
	IUserService iuserService;


	
	@PostMapping(value = "/addUser")
	public ResponseEntity<String> addnewUser(@RequestBody Userdto client)
	{
		return null;
			
	}
}
