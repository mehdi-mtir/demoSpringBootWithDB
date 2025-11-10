package com.m2i.demodb.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity
@Table(name = "livre")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(nullable = false)
    String titre;

    @ManyToOne(optional = false)
    @JoinColumn(name = "auteur_id", referencedColumnName = "id", nullable = false)
    Auteur auteur;
}
