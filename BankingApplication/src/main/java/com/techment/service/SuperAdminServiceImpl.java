package com.techment.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techment.dao.AdminRepository;
import com.techment.dao.BranchDao;
import com.techment.dto.BranchDto;
import com.techment.entity.Admin;
import com.techment.entity.Branch;

@Service
public class SuperAdminServiceImpl implements ISuperAdminService {
	
	@Autowired
	BranchDao branchDao;


	
	@Override
	public BranchDto addBranch(BranchDto branchDto) {
		Branch branch = new Branch();
		branch.setBranchName(branchDto.getBranchName());
		branch.setBranchCity(branchDto.getBranchCity());
		branch.setBranchCode(branchDto.getBranchCode());
		branch.setBranchZipCode(branchDto.getBranchZipCode());
		branch.setBranchState(branchDto.getBranchState());
		branchDao.save(branch);
		return branchDto;
		
	}



	@Override
	public boolean removeBranch(long branchId) {
		if (branchDao.findById(branchId).get() != null) {
			branchDao.deleteById(branchId);
			return true;
		} else
			return false;
	}


    //service impl. to get  the given id  branch list from database
	@Override
	public BranchDto fetchBranchById(long branchId) {
		Branch branch = branchDao.findById(branchId).get();
		BranchDto branchDto = new BranchDto(branch.getBranchId(),	
                branch.getBranchName(),
                branch.getBranchCity(),
                branch.getBranchState(),
                branch.getBranchCode(),
                branch.getBranchZipCode()) ;
		return branchDto;
	}


    //service impl. to get all the branch list from database
	@Override
	public List<BranchDto> listAllBranch() {
		List<Branch> branchList = branchDao.findAll();
		List<BranchDto>  branchDto = new ArrayList<BranchDto>();
		for(Branch branch : branchList) {
		      branchDto.add(new BranchDto(branch.getBranchId(),	
		    		                    branch.getBranchName(),
		    		                    branch.getBranchCity(),
		    		                    branch.getBranchState(),
		    		                    branch.getBranchCode(),
		    		                    branch.getBranchZipCode())) ;
		      }
		return branchDto;
			}



	@Override
	public BranchDto updateBranch(BranchDto branchDto, long branchId) {
		Branch branch = branchDao.findById(branchId).get();
		branchDto.getBranchId();
		branch.setBranchName(branchDto.getBranchName());
		branch.setBranchCity(branchDto.getBranchCity());
		branch.setBranchCode(branchDto.getBranchCode());
		branch.setBranchState(branchDto.getBranchState());
		branch.setBranchZipCode(branchDto.getBranchZipCode());
		
		branchDao.save(branch);
		return branchDto;
	}




}
