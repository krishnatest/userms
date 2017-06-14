package com.dxc.ms.users;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;


public class RemoteUsersRepository implements UserRepository {
	protected Logger logger = Logger.getLogger(RemoteUsersRepository.class.getName());

	private Map<String, Users> usersByNumbers = new HashMap<String, Users>();
	
	public RemoteUsersRepository() {
		Users userData = new Users("Krishna", "Kumar" , "kkumar92", 123, "Sec-62 Noida");
		usersByNumbers.put("101", userData);
		userData = new Users("Krishna1", "Kumar1" , "kkumar921", 1231, "Sec-62 Noida1");
		usersByNumbers.put("102", userData);
		logger.info("userData created");
	}

	@Override
	public List<Users> getAllUsers() {
		return new ArrayList<Users>(usersByNumbers.values());
	}

}
