package com.ejercicioBanco.app.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="prueba2")
public class Prueba2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2564479407062790720L;

	@Id
	@Column(name="prueba2_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="decrip")
	private String desc;
	
	@JsonIgnore
	//Foreign key
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="prueba_id_fk")
	private Prueba prueba; 

	public Prueba2() {
		super();
	}
	
	public Prueba2(Long id, String desc) {
		super();
		this.desc = desc;
	}
	

	public Prueba2(String desc, Prueba prueba) {
		super();
		this.desc = desc;
		this.prueba = prueba;
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

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

	@Override
	public String toString() {
		return "Prueba2 [id=" + id + ", desc=" + desc + ", prueba=" + prueba + "]";
	}
	
	

}
