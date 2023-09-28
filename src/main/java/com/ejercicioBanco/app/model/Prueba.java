package com.ejercicioBanco.app.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="prueba")
public class Prueba {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="descrip")
	private String desc;

	@OneToMany(mappedBy ="prueba",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Prueba2> pruebas2 = new ArrayList<Prueba2>();
	
	
	public Prueba() {
		super();
	}
	
	public Prueba(Long id, String desc) {
		super();
		this.desc = desc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
