package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.ExerciseDetails;

public class ExerciseDetailsDaoImpl extends BaseDao implements ExerciseDetailsDao{

	@Override
	public List<ExerciseDetails> getListExerciseDetails() throws Exception {
		return em.createQuery("FROM ExerciseDetails", ExerciseDetails.class).getResultList();
	}

	@Override
	public ExerciseDetails insert(ExerciseDetails data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public ExerciseDetails update(ExerciseDetails data) throws Exception {
		em.merge(data);
		return data;
	}

	@Override
	public void deleteById(String id) throws Exception {
		em.remove(id);
	}

}
