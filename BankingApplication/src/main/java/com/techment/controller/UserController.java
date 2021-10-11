package com.techment.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.techment.Entity.User;
import com.techment.Service.IUserServiceImpl;
import com.techment.dao.UserRepository;
import com.techment.dto.Userdto;

@Controller
public class UserController {
	
	@Autowired
	IUserServiceImpl userService;
	
	@Autowired
	UserRepository userRepository;
	
	@PostMapping(value = "/registerUser")

public ResponseEntity<String> registerUser(@RequestBody Userdto user) throws Exception {
		

		try {
			

			User Exist = userRepository.findByName(user.getName());
		
			
			
			
			if(Exist!=null)
				throw new Exception("User is already exist");
			else {

				String output =  userService.register(user);
				return new ResponseEntity<String>(output,HttpStatus.CREATED);
			}
			
			
		}catch(Exception e) {
			
			throw new Exception("User is already exist");
		}
		
		
		
	}
	
	@PutMapping("/updateUser/{userId}")
	public ResponseEntity<String> updateUser(@RequestBody Userdto user,@PathVariable int userId) throws Exception
	{
		try {
			String Output = userService.updateUser(user, userId);
			return new ResponseEntity<String>(Output,HttpStatus.ACCEPTED);
		}catch(Exception e)
		{
			throw new Exception("user not found");
		}
	}
	
	@DeleteMapping("/deleteUser/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable int userId) throws Exception{
		
		try {
			return new ResponseEntity<String>(userService.deleteUser(userId),HttpStatus.OK);
		}catch(Exception e) {
			throw new Exception("user not found");
		}
		
	}
}
