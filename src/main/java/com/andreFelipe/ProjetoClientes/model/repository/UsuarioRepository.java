package com.andreFelipe.ProjetoClientes.model.repository;

import com.andreFelipe.ProjetoClientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
