package com.lawencon.testapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lawencon.testapp.dao.ExerciseDetailsDao;
import com.lawencon.testapp.model.ExerciseDetails;

@Service
@Transactional
public class ExerciseDetailsServiceImpl implements ExerciseDetailsService{

	@Autowired
	private ExerciseDetailsDao exerciseDetailsDao;
	
	@Override
	public List<ExerciseDetails> getListExerciseDetails() throws Exception {
		return exerciseDetailsDao.getListExerciseDetails();
	}

	@Override
	public ExerciseDetails insert(ExerciseDetails data) throws Exception {
		return exerciseDetailsDao.insert(data);
	}

	@Override
	public ExerciseDetails update(ExerciseDetails data) throws Exception {
		return exerciseDetailsDao.update(data);
	}

	@Override
	public void deleteById(String id) throws Exception {
		exerciseDetailsDao.deleteById(id);
	}
	
}
