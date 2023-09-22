package com.ejercicioBanco.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Tipo_de_cuenta")
public class TipoCuenta {
	
	@Id
	@SequenceGenerator(name="tipoCuenta_sequence",sequenceName="tipoCuenta_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "tipoCuenta_sequence")
	@Column(name="Tipo_de_cuenta_ID")
	private Long id;
	
	@Column(name="CodigoCuenta")
	private String codigoCuenta;
	
	@Column(name="TasaInteres")
	private double tasaInteres;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigoCuenta() {
		return codigoCuenta;
	}

	public void setCodigoCuenta(String codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}
	
}
