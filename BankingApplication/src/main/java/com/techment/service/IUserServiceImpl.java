package com.techment.Service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techment.Entity.User;
import com.techment.dao.UserRepository;
import com.techment.dto.Userdto;

@Service
public class IUserServiceImpl implements IUserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Override
	public String register1(Userdto user) {
	

		User user1 = new User(user.getName(), user.getPassword(), user.getRole(),user.getToken());
		userRepository.save(user1);
		return "User sucessfully Added";

	}

	

	
	public String updateUser(Userdto user,long userId) {

		User oldUser = userRepository.findById(userId).get();

		oldUser.setPassword(user.getPassword());
		oldUser.setRole(user.getRole());

		userRepository.save(user);




		return "Updated";
	}

	
	public String DelUser(User user) {
		userRepository.delete(user);
		return "User Details Delete Sucessfully";
	}


	@Override
	public String register(Userdto user) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String updateUser(Userdto user, int userId) {
		// TODO Auto-generated method stub
		return null;
	}
	



}
