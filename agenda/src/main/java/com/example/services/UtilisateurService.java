package com.example.services;

import java.util.List;

import com.example.models.Utilisateur;

public interface UtilisateurService {

	public Utilisateur findById(Long id);
	
	public List<Utilisateur> findAll();
	
	public Utilisateur save(Utilisateur utilisateur);
	
	public Utilisateur delete (Long id);
}
