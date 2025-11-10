DROP TABLE IF EXISTS auteur;
DROP TABLE IF EXISTS livre;

CREATE TABLE auteur(
    id integer AUTO_INCREMENT PRIMARY KEY,
    prenom VARCHAR(100) NOT NULL,
    nom VARCHAR(100) NOT NULL
);

CREATE TABLE livre(
    id integer AUTO_INCREMENT PRIMARY KEY,
    titre VARCHAR(255) NOT NULL,
    auteur_id integer,
    FOREIGN KEY (auteur_id) REFERENCES auteur(id)
);