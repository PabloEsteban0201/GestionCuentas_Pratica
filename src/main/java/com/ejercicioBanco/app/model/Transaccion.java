package com.ejercicioBanco.app.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Transaccion")
public class Transaccion {

	@Id
	@SequenceGenerator(name="transaccion_sequence",sequenceName="transaccion_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "transaccion_sequence")
	@Column(name="Transaccion_ID")
	private Long id;
	
	@Column(name="Tipo_transaccion")
	private String tipo;
	
	@Column(name="Monto")
	private double monto;
	
	@Column(name="Fecha")
	private LocalDateTime fecha;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	
	
	
}
