package com.example.demo.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personas")
public class Persona {

	@Id
	private int cedula;
	private String nombre;
	private LocalDate fecha_nacimiento;
	
	public Persona() {}
	
	public Persona(int cedula, String nombre, LocalDate fecha_nacimiento) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
	public int getCedula() {
		return cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	
}
