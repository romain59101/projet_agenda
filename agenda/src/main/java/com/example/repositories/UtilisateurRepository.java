package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
