package com.andreFelipe.ProjetoClientes.rest.exceptions;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErros {

    public ApiErros(List<String> erros) {
        this.erros = erros;
    }

    public ApiErros(String message) {
        this.erros = Arrays.asList(message);
    }


    @Getter
    private List<String> erros;


}
