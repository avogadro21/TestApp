package com.lawencon.testapp.service;

import java.util.List;

import com.lawencon.testapp.model.Users;

public interface UsersService {
	
	List<Users> getListUsers() throws Exception;
	
	Users insert(Users data) throws Exception;
	
	Users update(Users data) throws Exception;
	
	void deleteById(String id) throws Exception;
	
}
