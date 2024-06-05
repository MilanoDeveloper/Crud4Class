package com.milano.milanodev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milano.milanodev.dto.PessoaDto;
import com.milano.milanodev.entities.Pessoa;
import com.milano.milanodev.repositoy.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public PessoaDto findById(Long id){
        Pessoa entity = pessoaRepository.findById(id).get();
        PessoaDto dto = new PessoaDto(entity);
        return dto;
    }
}
