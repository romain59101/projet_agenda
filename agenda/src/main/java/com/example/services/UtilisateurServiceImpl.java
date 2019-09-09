package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Utilisateur;
import com.example.repositories.UtilisateurRepository;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	private UtilisateurRepository userRep;

	@Override
	public Utilisateur findById(Long id) {
		return userRep.findById(id).get();
	}

	@Override
	public List<Utilisateur> findAll() {
		return userRep.findAll();
	}

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		return userRep.save(utilisateur);
	}

	@Override
	public Utilisateur delete(Long id) {
		Utilisateur temp = findById(id);
		userRep.deleteById(id);
		return temp;
	}
	
	
	
}
