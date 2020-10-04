package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.QuestionTypes;

public interface QuestionTypesDao {
	
	List<QuestionTypes> getListQuestionTypes() throws Exception;
	
	QuestionTypes insert(QuestionTypes data) throws Exception;
	
	QuestionTypes update(QuestionTypes data) throws Exception;
	
	void delete(String id) throws Exception;
	
}
