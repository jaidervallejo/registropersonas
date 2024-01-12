package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Person {

	@Id
	private int id;
	private String name;
	private LocalDate birthDate;
	private int age;
	
	public Person() {}
	
	public Person(int id, String name, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public int getAge() {
		return age;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
