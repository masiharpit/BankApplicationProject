package com.techment.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long>{

}
