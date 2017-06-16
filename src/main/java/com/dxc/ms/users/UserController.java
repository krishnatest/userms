package com.dxc.ms.users;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	protected Logger logger = Logger.getLogger(UserController.class.getName());
	
	@Autowired
	UserRepository userRepository;
	
	@RequestMapping("/users")
	public Users[] all() {
		logger.info("users-microservice all() invoked");
		List<Users> accounts = userRepository.getAllUsers();
		logger.info("users-microservice all() found: " + accounts.size());
		return accounts.toArray(new Users[accounts.size()]);
	}
	
	
}