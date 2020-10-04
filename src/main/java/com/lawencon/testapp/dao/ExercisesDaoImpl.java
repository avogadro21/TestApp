package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Exercises;

public class ExercisesDaoImpl extends BaseDao implements ExercisesDao {

	@Override
	public List<Exercises> getListExercises() throws Exception {
		return em.createQuery("FROM Exercises", Exercises.class).getResultList();
	}

	@Override
	public Exercises insert(Exercises data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public Exercises update(Exercises data) throws Exception {
		em.merge(data);
		return data;
	}

	@Override
	public void delete(String id) throws Exception {
		em.remove(id);
	}
	
	

}
