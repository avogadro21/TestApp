package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Users;

public class UsersDaoImpl extends BaseDao implements UsersDao {

	@Override
	public List<Users> getListUsers() throws Exception {
		return em.createQuery("FROM Users", Users.class).getResultList();
	}

	@Override
	public Users insert(Users data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public Users update(Users data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public void deleteById(String id) throws Exception {
		em.remove(id);
	}
	
	
}
