package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Person;

public interface PersonService {

	public abstract List<Person> listAllPeople();
	public abstract Person addPerson(Person person);
	public abstract int removePersonById(int id);
	public abstract Person updatePerson(Person person);
}
