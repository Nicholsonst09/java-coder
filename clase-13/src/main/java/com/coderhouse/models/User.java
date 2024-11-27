package com.coderhouse.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	
	private String id;
	private String created;
	private String name;
	private String surname;
	private String email;
	
	public User() {
		super();
	}



	public User(String created, String name, String surname, String email) {
		super();
		this.created = created;
		this.name = name;
		this.surname = surname;
		this.email = email;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getCreated() {
		return created;
	}



	public void setCreated(String created) {
		this.created = created;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getSurname() {
		return surname;
	}



	public void setSurname(String surname) {
		this.surname = surname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", created=" + created + ", name=" + name + ", surname=" + surname + ", email="
				+ email + "]";
	}
	
	
	
	
	
	
	
}
