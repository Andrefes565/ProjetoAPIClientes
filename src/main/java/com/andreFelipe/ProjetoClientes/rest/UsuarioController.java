package com.andreFelipe.ProjetoClientes.rest;

import com.andreFelipe.ProjetoClientes.model.entity.Usuario;
import com.andreFelipe.ProjetoClientes.model.repository.ClienteRepository;
import com.andreFelipe.ProjetoClientes.model.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    @Autowired
    private final UsuarioRepository repository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario salvar(@RequestBody @Valid Usuario usuario){
       return repository.save(usuario);
    }
}
