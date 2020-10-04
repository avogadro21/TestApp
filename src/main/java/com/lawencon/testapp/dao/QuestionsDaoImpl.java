package com.lawencon.testapp.dao;

import java.util.List;

import com.lawencon.testapp.model.Questions;

public class QuestionsDaoImpl extends BaseDao implements QuestionsDao{

	@Override
	public List<Questions> getListQuestions() throws Exception {
		return em.createQuery("FROM Questions", Questions.class).getResultList();
	}

	@Override
	public Questions insert(Questions data) throws Exception {
		em.persist(data);
		return data;
	}

	@Override
	public Questions update(Questions data) throws Exception {
		em.merge(data);
		return data;
	}

	@Override
	public void deleteById(String id) throws Exception {
		em.remove(id);
	}
	
}
