package com.andreFelipe.ProjetoClientes.model.repository;

import com.andreFelipe.ProjetoClientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
