package com.lawencon.testapp.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_hdr_exercises")
public class Exercises {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String code;
	
	@ManyToOne
	@Column(name = "id_user")
	private Users idUser;
	
	@Column(name = "total_score")
	private Integer totalScore;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	private String result;

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

	public Users getIdUser() {
		return idUser;
	}

	public void setIdUser(Users idUser) {
		this.idUser = idUser;
	}

	public Integer getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(Integer totalScore) {
		this.totalScore = totalScore;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
	
	
}
