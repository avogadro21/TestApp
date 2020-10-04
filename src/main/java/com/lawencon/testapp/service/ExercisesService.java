package com.lawencon.testapp.service;

import java.util.List;

import com.lawencon.testapp.model.Exercises;

public interface ExercisesService {
	
	List<Exercises> getListExercises() throws Exception;
	
	Exercises insert(Exercises data) throws Exception;
	
	Exercises update(Exercises data) throws Exception;
	
	void deleteById(String id) throws Exception;

}
