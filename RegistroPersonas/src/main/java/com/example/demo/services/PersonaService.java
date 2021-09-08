package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Persona;

public interface PersonaService {

	public abstract List<Persona> listAllPeople();
	public abstract Persona addPersona(Persona persona);
	public abstract int removePersonaById(int cedula);
	public abstract Persona updatePersona(Persona persona);
}
