package com.lawencon.testapp.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_m_users")
public class Users {
	
	@Id
	private String id = UUID.randomUUID().toString();
	
	private String name;
	
	@NotNull
	@Column(nullable = false)
	private String pass;
	
	@NotNull
	@Column(name = "user_name", nullable = false)
	private String username;
	
	@NotNull
	@Column(nullable = false, unique = true)
	private String nik;
	
	private String address;
	private String contact;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
}

