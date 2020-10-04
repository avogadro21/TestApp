package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Exercises;

public interface ExercisesDao {
	
List<Exercises> getListExercises() throws Exception;
	
	Exercises insert(Exercises data) throws Exception;
	
	Exercises update(Exercises data) throws Exception;
	
	void delete(String id) throws Exception;

}
