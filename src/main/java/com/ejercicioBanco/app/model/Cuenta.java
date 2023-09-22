package com.ejercicioBanco.app.model;

import java.math.BigInteger;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="Cuenta")
public class Cuenta {
	
	@Id
	@SequenceGenerator(name="cuenta_sequence",sequenceName="cuenta_sequence",allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "cuenta_sequence")
	@Column(name="Cuenta_ID")
	private Long id;
	
	@Column(name="Numero")
	private BigInteger numeroCuenta;
	
	@Column(name="Saldo")
	private double saldo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public BigInteger getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(BigInteger numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
	
	
	
	
	
	
}
