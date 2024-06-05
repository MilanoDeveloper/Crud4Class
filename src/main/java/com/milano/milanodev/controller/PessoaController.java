package com.milano.milanodev.controller;

import org.springframework.web.bind.annotation.RestController;

import com.milano.milanodev.dto.PessoaDto;
import com.milano.milanodev.service.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/pessoa")
public class PessoaController {
    
    @Autowired
    PessoaService pService;

    @GetMapping("/{id}")
    public PessoaDto findByIdPessoa(@PathVariable Long id) {
        return pService.findById(id);
    }
    

}
