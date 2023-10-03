package com.ejercicioBanco.app.model;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
public class Prueba implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7519350062284428467L;

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="descrip")
	private String desc;

	//Con el json ignore es posible evitar que se muestre en el get
	//@JsonIgnore
	@OneToMany(mappedBy ="prueba",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Prueba2> pruebas2;
	
	public Prueba() {
		super();
	}
	
	public Prueba(Long id, String desc) {
		super();
		this.desc = desc;
	}

	
	public Prueba(String desc, List<Prueba2> pruebas2) {
		super();
		this.desc = desc;
		this.pruebas2 = pruebas2;
	}

	
	public List<Prueba2> getPruebas2() {
		return pruebas2;
	}

	public void setPruebas2(List<Prueba2> pruebas2) {
		this.pruebas2 = pruebas2;
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
