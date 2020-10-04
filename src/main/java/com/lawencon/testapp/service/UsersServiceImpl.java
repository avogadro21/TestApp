package com.lawencon.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.testapp.dao.UsersDao;
import com.lawencon.testapp.model.Users;

@Service
@Transactional
public class UsersServiceImpl implements UsersService{

	@Autowired
	private UsersDao usersDao;
	
	@Override
	public List<Users> getListUsers() throws Exception {
		return usersDao.getListUsers();
	}

	@Override
	public Users insert(Users data) throws Exception {
		return usersDao.insert(data);
	}

	@Override
	public Users update(Users data) throws Exception {
		return usersDao.update(data);
	}

	@Override
	public void deleteById(String id) throws Exception {
		usersDao.deleteById(id);
	}

}
