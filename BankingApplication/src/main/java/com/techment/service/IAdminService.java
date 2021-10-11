package com.techment.service;

import java.util.List;

import com.techment.dto.AdminDto;
import com.techment.entity.Admin;

public interface IAdminService {

	Admin findAdminById(Long adminId);
	List<Admin> ViewAllAdmins();
	String AddAdmin(Admin admin);
	String DelAdmin(Admin admin);
	
	//////////
	AdminDto findAdminById(long adminId);
	List<AdminDto> listAllAdmins();
	boolean removeAdmin( long adminId);
	AdminDto addAdmin(AdminDto adminDto);
	AdminDto updateAdmin(AdminDto adminDto );
}
