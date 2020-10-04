package com.lawencon.testapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_M_questions")
public class Questions {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String code;
	
	private String question;
	
	@ManyToOne
	@JoinColumn(name = "id_question_type")
	private QuestionTypes idQuestionType;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public QuestionTypes getIdQuestionType() {
		return idQuestionType;
	}

	public void setIdQuestionType(QuestionTypes idQuestionType) {
		this.idQuestionType = idQuestionType;
	}
	
	
}
