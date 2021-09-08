package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Persona;

@Repository("personaRepository")
public interface PersonaRepository extends JpaRepository</*Clase Modelo*/ Persona, Integer>{

	// Solucionamos el error del metoto "deleteById" por defecto, el cual no nos dejaba eliminar
	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM personas WHERE cedula = ?1")
	public void deleteById(int id);
}
