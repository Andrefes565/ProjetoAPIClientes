package com.andreFelipe.ProjetoClientes.model.repository;

import com.andreFelipe.ProjetoClientes.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
