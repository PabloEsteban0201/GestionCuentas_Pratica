package com.ejercicioBanco.app.model;

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
public class Prueba2 {
	
	@Id
	@Column(name="prueba2_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="decrip")
	private String desc;
	
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
