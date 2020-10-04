package com.lawencon.testapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_dtl_exercises")
public class ExerciseDetails {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@ManyToOne
	@Column(name = "id_ exercise")
	private Exercises idExercise;
	
	@ManyToOne
	@Column(name = "id_question")
	private Questions idQustion;
	
	private Integer score;
	private String answer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Exercises getIdExercise() {
		return idExercise;
	}
	public void setIdExercise(Exercises idExercise) {
		this.idExercise = idExercise;
	}
	public Questions getIdQustion() {
		return idQustion;
	}
	public void setIdQustion(Questions idQustion) {
		this.idQustion = idQustion;
	}
	public Integer getScore() {
		return score;
	}
	public void setScore(Integer score) {
		this.score = score;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	
}
