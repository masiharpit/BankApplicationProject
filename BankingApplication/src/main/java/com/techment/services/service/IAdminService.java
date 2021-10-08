package com.techment.service;

import java.util.List;

import com.techment.entity.Admin;

public interface IAdminService {

	Admin findAdminById(Long adminId);
	List<Admin> ViewAllAdmins();
	String AddAdmin(Admin admin);
	String DelAdmin(Admin admin);
	
	
}
