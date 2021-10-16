package com.techment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Branch;

public interface BranchDao extends JpaRepository<Branch, Long> {

	Branch findByBranchId(long branchId);
}
