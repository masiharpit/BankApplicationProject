package com.techment.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Entity.Admin;
import com.techment.Entity.User;
import com.techment.dao.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	



}
