package com.dxc.ms.users;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper
{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();
		user.setUsersFname(rs.getString("usersFname"));
		user.setUsersLname(rs.getString("usersLname"));
		user.setUsersShortId(rs.getString("usersShortId"));
		user.setMobile(rs.getLong("mobile"));
		user.setAddress(rs.getString("address"));
		return user;
	}

}
