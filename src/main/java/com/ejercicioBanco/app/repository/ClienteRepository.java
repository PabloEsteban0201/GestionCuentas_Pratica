package com.ejercicioBanco.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicioBanco.app.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
