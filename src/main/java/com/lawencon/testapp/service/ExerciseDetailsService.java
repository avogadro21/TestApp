package com.lawencon.testapp.service;

import java.util.List;

import com.lawencon.testapp.model.ExerciseDetails;

public interface ExerciseDetailsService {
	
	List<ExerciseDetails> getListExerciseDetails() throws Exception;
	
	ExerciseDetails insert(ExerciseDetails data) throws Exception;
	
	ExerciseDetails update(ExerciseDetails data) throws Exception;
	
	void deleteById(String id) throws Exception; 

}
