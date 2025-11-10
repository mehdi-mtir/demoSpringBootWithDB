package com.m2i.demodb.repositories;

import com.m2i.demodb.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Livre, Integer> {
}
