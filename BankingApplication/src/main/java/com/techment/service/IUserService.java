package com.techment.Service;


import com.techment.dto.Userdto;

public interface IUserService {
	
	String register(Userdto user);
	String deleteUser(int userId);
	String updateUser(Userdto user,int userId);
	String register1(Userdto user);

}
