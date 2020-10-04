package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.QuestionTypes;

public class QuestionTypesDaoImpl extends BaseDao implements QuestionTypesDao {

	@Override
	public List<QuestionTypes> getListQuestionTypes() throws Exception {
		return em.createQuery("FROM QuestionTypes", QuestionTypes.class).getResultList();
	}

	@Override
	public QuestionTypes insert(QuestionTypes data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public QuestionTypes update(QuestionTypes data) throws Exception {
		em.merge(data);
		return data;
	}

	@Override
	public void deleteById(String id) throws Exception {
		em.remove(id);
	}
	
	

}
