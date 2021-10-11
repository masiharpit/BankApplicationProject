package com.techment.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.Entity.User;
import com.techment.dto.Userdto;

public interface UserRepository extends JpaRepository<User, Long> {

	void save(Userdto user);

	User findByName(String name);

	


 
	

}
