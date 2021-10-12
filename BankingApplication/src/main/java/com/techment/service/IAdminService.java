package com.techment.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.techment.dto.AdminDto;
import com.techment.entity.Admin;

@Service
public interface IAdminService {
   
	AdminDto findAdminById(long adminId);
	List<AdminDto> listAllAdmins();
	boolean removeAdmin( long adminId);
	AdminDto addAdmin(AdminDto adminDto);
	AdminDto updateAdmin(AdminDto adminDto,long adminId );
}
