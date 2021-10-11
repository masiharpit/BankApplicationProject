package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.entity.Admin;
import com.techment.dao.AdminRepository;
import com.techment.dto.AdminDto;

@Service
public class AdminService implements IAdminService {

	@Autowired
	AdminRepository adminRepository;

	@Override
	public AdminDto findAdminById(long adminId) {
		Admin admin = adminRepository.findById(adminId).get();
		AdminDto adminDto = new AdminDto(admin.getAdminId(), admin.getAdminName(), admin.getAdminContact(),
				admin.getAdminEmailId());
		return adminDto;
	}

	//service implementated to get the all admin list...
	@Override
	public List<AdminDto> listAllAdmins() {
		List<Admin> adminList = adminRepository.findAll();
		List<AdminDto> adminDtos = new ArrayList<AdminDto>();
		for (Admin admin : adminList) {
			adminDtos.add(new AdminDto(admin.getAdminId(), admin.getAdminName(), admin.getAdminContact(),
					admin.getAdminEmailId()));
		}
		return adminDtos;
	}

	@Override
	public boolean removeAdmin(long adminId) {
		if (adminRepository.findById(adminId).get() != null) {
			adminRepository.deleteById(adminId);
			return true;
		} else
			return false;
	}

	@Override
	public AdminDto addAdmin(AdminDto adminDto) {
		Admin admin = new Admin();
		admin.setAdminName(adminDto.getAdminName());
		admin.setAdminContact(adminDto.getAdminContact());
		admin.setAdminEmailId(adminDto.getAdminEmailId());
		admin.setAdminId(adminDto.getAdminId());
		adminRepository.save(admin);
		return adminDto;
	}
	
	@Override
	public AdminDto updateAdmin(AdminDto adminDto) {
		Admin admin=adminRepository.findById(adminDto.getAdminId()).get();
		admin.setAdminName(adminDto.getAdminName());
		admin.setAdminContact(adminDto.getAdminContact());
		admin.setAdminEmailId(adminDto.getAdminEmailId());
	
		
		return adminDto;
	}

	// ----------------------------------------------------------------

	@Override
	public Admin findAdminById(Long adminId) {
		Admin admin = adminRepository.findById(adminId).get();
		//admin.setStatus("ok");

		return admin;

	}

	public List<Admin> ViewAllAdmins() {
		List<Admin> admins = adminRepository.findAll();
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
