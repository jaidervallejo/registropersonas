package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository("personaRepository")
public interface PersonRepository extends JpaRepository</*Model Class*/ Person, Integer>{

	// Solucionamos el error del metodo "deleteById" por defecto, el cual no nos dejaba eliminar
	// Solving the error on the method "deleteById" by default, which didn't allow us to delete
	@Modifying
	@Query(nativeQuery=true, value="DELETE FROM personas WHERE cedula = ?1")
	public void deleteById(int id);
}
