package com.techment.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
