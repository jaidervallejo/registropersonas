package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Person;
import com.example.demo.repository.PersonRepository;
import com.example.demo.services.PersonService;

@Service("personaServiceImpl")
public class PersonServiceImpl implements PersonService{

	@Autowired
	@Qualifier("personaRepository")
	private PersonRepository personaRepository;
	
	
	@Override
	public List<Person> listAllPeople() {
		return personaRepository.findAll();
	}

	@Override
	public Person addPerson(Person person) {
		return personaRepository.save(person);
	}

	@Override
	public int removePersonById(int id) {
		
		if(personaRepository.existsById(id)) {//Verifica que exista la persona
			personaRepository.deleteById(id);
		}
		
		return 0;
	}

	@Override
	public Person updatePerson(Person person) {
		return personaRepository.save(person);
	}

}
