package com.techment.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.Entity.Admin;
import com.techment.dto.Admindto;

public interface AdminRepository extends JpaRepository<Admin, Long>{

	void save(Admindto admin);


}
