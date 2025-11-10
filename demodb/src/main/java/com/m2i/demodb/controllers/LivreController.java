package com.m2i.demodb.controllers;

import com.m2i.demodb.model.Livre;
import com.m2i.demodb.repositories.LivreRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;

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

    @GetMapping(path = "{id}")
    public Livre getLivreById(@PathVariable("id") int id){
        return livreRepository.findById(id)
                .orElseThrow(()->new NoSuchElementException("Livre introuvable"));
    }

    @GetMapping(path = "auteur/{idauteur}")
    public List<Livre> getLivreByAuteur(@PathVariable("idauteur") int idAuteur){
        return livreRepository.findByAuteurId(idAuteur);
    }





}
