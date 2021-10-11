package com.techment.Service;

import java.util.List;

import com.techment.Entity.Admin;
import com.techment.dto.Admindto;

public interface IAdminService {

	Admin findAdminById(Long adminId);
	List<Admin> ViewAllAdmins();
	String AddAdmin(Admin admin);
	String DelAdmin(Admin admin);
	String AddAdmin(Admindto admin);
	Admin getAdminById(long id);
	String deleteAdminById(long id);
	String updateAdmin(long id, Admindto admin);
	
	
}
