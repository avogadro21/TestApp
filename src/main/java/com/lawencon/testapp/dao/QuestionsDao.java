package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Questions;

public interface QuestionsDao {
	
List<Questions> getListQuestions() throws Exception;
	
	Questions insert(Questions data) throws Exception;
	
	Questions update(Questions data) throws Exception;
	
	void delete(String id) throws Exception;

}
