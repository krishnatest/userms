package com.dxc.ms.users;

import java.sql.SQLException;
import java.util.*;
import java.util.logging.Logger;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.jdbc.core.RowMapper;

@Repository
public class RemoteUsersRepository implements UserRepository {
	protected Logger logger = Logger.getLogger(RemoteUsersRepository.class.getName());
	
	@Autowired
    private JdbcTemplate jdbcTemplate;

	//private Map<String, Users> usersByNumbers = new HashMap<String, Users>();
	

	public List<Users> RemoteUsersRepositoryTest() {
		List<Users> uList = new ArrayList<Users>();

        //Users userData = jdbcTemplate.queryForObject("SELECT * FROM users", Users.class);		
		
		//Users userData = new Users("Krishna", "Kumar" , "kkumar92", 123, "Sec-62 Noida");
		//usersByNumbers.put("101", userData);
		//uList.add(userData);
		//userData = new Users("Krishna1", "Kumar1" , "kkumar921", 1231, "Sec-62 Noida1");
		//usersByNumbers.put("102", userData);
		//uList.add(userData);
		logger.info("method RemoteUsersRepositoryTest called");
		
		/*
		SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
	    dataSource.setDriver(new com.mysql.jdbc.Driver());
	    dataSource.setUrl("jdbc:mysql://localhost:3308/SpringMs");
	    dataSource.setUsername("root");
	    dataSource.setPassword("root");
	    JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
	    */
	    
        //String sqlUpdate = "UPDATE users set usersFname=? where usersShortId=?";
        //jdbcTemplate.update(sqlUpdate, "Kimsd", "akumar92");
        
        
        String sqlSelect = "SELECT * FROM users";
        List<Users> listContact = jdbcTemplate.query(sqlSelect, new RowMapper<Users>() {

            public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
        		Users user = new Users();
        		user.setUsersFname(rs.getString("usersFname"));
        		user.setUsersLname(rs.getString("usersLname"));
        		user.setUsersShortId(rs.getString("usersShortId"));
        		user.setMobile(rs.getLong("mobile"));
        		user.setAddress(rs.getString("address"));
        		uList.add(user);
                return user;
            }
        });
        
        return uList;
	}

	@Override
	public List<Users> getAllUsers() {
		logger.info("Get AllUsers called first");
		List<Users> uList = this.RemoteUsersRepositoryTest();
		//return new ArrayList<Users>(usersByNumbers.values());
		return uList;
	}

}
