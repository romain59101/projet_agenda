package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.Utilisateur;
import com.example.services.UtilisateurService;

@Controller
@RequestMapping(value="./api/user")
public class UtilisateurController {
	
	@Autowired
	private UtilisateurService userSer;
	
	
	@GetMapping(value="/{id}")
	public Utilisateur findById(@PathVariable ("id") Long id) {
		return userSer.findById(id);	
	}
	
	@GetMapping(value="")
	public List<Utilisateur> findAll() {
		return userSer.findAll();		
	}
	
	@PostMapping(value="")
	public Utilisateur save(Utilisateur utilisateur) {
		return userSer.save(utilisateur);
	}

	@RequestMapping(value="/{id}/delete")
	public Utilisateur delete(@PathVariable("id") Long id) {
		return userSer.delete(id);
	}
	
}
