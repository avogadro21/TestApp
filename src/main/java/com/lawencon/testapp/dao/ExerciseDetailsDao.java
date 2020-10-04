package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.ExerciseDetails;

public interface ExerciseDetailsDao {
	
List<ExerciseDetails> getListExerciseDetails() throws Exception;
	
	ExerciseDetails insert(ExerciseDetails data) throws Exception;
	
	ExerciseDetails update(ExerciseDetails data) throws Exception;
	
	void delete(String id) throws Exception;

}
