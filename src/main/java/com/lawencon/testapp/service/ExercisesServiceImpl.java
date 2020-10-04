package com.lawencon.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.testapp.dao.ExercisesDao;
import com.lawencon.testapp.model.Exercises;

@Service
@Transactional
public class ExercisesServiceImpl implements ExercisesService{
	
	@Autowired
	private ExercisesDao exercisesDao;

	@Override
	public List<Exercises> getListExercises() throws Exception {
		return exercisesDao.getListExercises();
	}

	@Override
	public Exercises insert(Exercises data) throws Exception {
		return exercisesDao.insert(data);
	}

	@Override
	public Exercises update(Exercises data) throws Exception {
		return exercisesDao.update(data);
	}

	@Override
	public void deleteById(String id) throws Exception {
		exercisesDao.deleteById(id);
	}

}
