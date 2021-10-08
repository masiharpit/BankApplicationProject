package com.techment.Service;

import java.util.List;

import com.techment.Entity.Admin;

public interface IAdminService {

	Admin findAdminById(Long adminId);
	List<Admin> ViewAllAdmins();
	String AddAdmin(Admin admin);
	String DelAdmin(Admin admin);
	
	
}
