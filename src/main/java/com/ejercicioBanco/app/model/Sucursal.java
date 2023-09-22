package com.ejercicioBanco.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Sucursal")
public class Sucursal {
	
	@Id
	@SequenceGenerator(name="sucursal_sequence",sequenceName="sucursal_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "sucursal_sequence")
	@Column(name="Sucursal_ID")
	private Long id;
	
	@Column(name="Nombre")
	private String nombre;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
