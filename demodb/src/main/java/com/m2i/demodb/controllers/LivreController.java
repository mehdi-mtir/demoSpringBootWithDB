package com.m2i.demodb.controllers;

import com.m2i.demodb.model.Livre;
import com.m2i.demodb.repositories.LivreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {
    private final LivreRepository livreRepository;

    public LivreController(LivreRepository livreRepository){
        this.livreRepository = livreRepository;
    }

    @GetMapping(path = "")
    public List<Livre> getLivres(){
        return livreRepository.findAll();
    }



}
