package com.milano.milanodev.dto;

import com.milano.milanodev.entities.Pessoa;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PessoaDto {
    
    private Long id;
    private String name;
    private int idade;
    private String email;

    public PessoaDto(){}

    public PessoaDto(Pessoa pessoa){

        id    = pessoa.getId();
        name  = pessoa.getName();
        idade = pessoa.getIdade();
        email = pessoa.getEmail();
    }

}
