package com.techment.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Entity.Admin;
import com.techment.dao.AdminRepository;



@Service
public class AdminService implements IAdminService {
	
	@Autowired	
	 AdminRepository adminRepository;
	
	@Override
	public Admin findAdminById(Long adminId) {
		Admin admin= adminRepository.findById(adminId).get();
		admin.setStatus("ok");
		
		return admin;
		
	}

	
	public List<Admin> ViewAllAdmins() {
		List<Admin> admins =adminRepository.findAll();
		return admins;
	}

	
	public String AddAdmin(Admin admin) {
			adminRepository.save(admin);
		return "Admin Details Added Sucessfully";
	}

	
	public String DelAdmin(Admin admin) {
		adminRepository.delete(admin);
		return "Admin Details Delete Sucessfully";
	}

	
	
	}
	


