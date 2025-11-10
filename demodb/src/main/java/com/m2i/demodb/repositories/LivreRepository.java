package com.m2i.demodb.repositories;

import com.m2i.demodb.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
    List<Livre> findByAuteurId(int idAuteur);
}
