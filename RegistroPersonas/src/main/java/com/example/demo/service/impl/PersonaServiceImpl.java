package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.demo.model.Persona;
import com.example.demo.repository.PersonaRepository;
import com.example.demo.services.PersonaService;

@Service("personaServiceImpl")
public class PersonaServiceImpl implements PersonaService{

	@Autowired
	@Qualifier("personaRepository")
	private PersonaRepository personaRepository;
	
	
	@Override
	public List<Persona> listAllPeople() {
		return personaRepository.findAll();
	}

	@Override
	public Persona addPersona(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public int removePersonaById(int cedula) {
		
		if(personaRepository.existsById(cedula)) {//Verifica que exista la persona
			personaRepository.deleteById(cedula);
		}
		
		return 0;
	}

	@Override
	public Persona updatePersona(Persona persona) {
		return personaRepository.save(persona);
	}

}
