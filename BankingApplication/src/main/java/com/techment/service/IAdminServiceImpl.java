package com.techment.Service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.Entity.Admin;
import com.techment.dao.AdminRepository;
import com.techment.dto.Admindto;



@Service
public class IAdminServiceImpl implements IAdminService {
	
	@Autowired	
	 AdminRepository adminRepository;
	
	@Override
	public Admin findAdminById(Long id) {
		Admin admin= adminRepository.findById(id).get();
		admin.setStatus("ok");
		
		return admin;
		
	}

	
	public List<Admin> ViewAllAdmins() {
		List<Admin> admins =adminRepository.findAll();
		return admins;
	}

	
	

	public String AddAdmin1(Admindto admin) {
		if(admin.getEmail()==null||admin.getEmail()=="")
		{
			return ("Please enter your vailed email");
		}
		
		else if(admin.getName()==null||admin.getName()=="")
		{
			return  ("Please enter name");
		}
		
		else if(admin.getContact()==null||admin.getContact()=="")
		{
			return ("Please enter contactnumber");
		}
		else {
			
			adminRepository.save(admin);
		return "Admin Registerd Successfully";
		}
		
        }
	
	public String DelAdmin(Admin admin) {
		adminRepository.delete(admin);
		return "Admin Details Delete Sucessfully";
	}

	
	public String updateAdmin(long id, Admindto admin) {

		Admin A = adminRepository.findById(id).get();
		
		
			A.setContact(admin.getContact());
			A.setName(admin.getName());
			A.setEmail(admin.getEmail());

			adminRepository.save(A);
			
	
	
		return "Admin updated";
	}


	@Override
	public String AddAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return null;
	}


	


	@Override
	public Admin getAdminById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String AddAdmin(Admindto admin) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String deleteAdminById(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	}
	


