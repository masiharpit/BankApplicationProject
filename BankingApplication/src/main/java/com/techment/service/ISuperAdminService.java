package com.techment.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techment.dto.AdminDto;
import com.techment.dto.BranchDto;

@Service
public interface ISuperAdminService {
   
	BranchDto addBranch(BranchDto branchDto);
	BranchDto updateBranch(BranchDto branchDto,long branchId );
	boolean removeBranch( long branchId);
	BranchDto fetchBranchById(long branchId);
	List<BranchDto> listAllBranch();
	
	
}
