package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Users;

public interface UsersDao {
	
	List<Users> getListUsers() throws Exception;
	
	Users insert(Users data) throws Exception;
	
	Users update(Users data) throws Exception;
	
	void delete(String id) throws Exception;

}
