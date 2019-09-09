package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Secteur;
import com.example.services.SecteurService;

@RestController
@RequestMapping(value="/api/secteurs")
															//Si on ajoute la sécurité : @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")  ou   @PreAuthorize("permitAll()")
public class SecteurController {

	
		@Autowired
		private SecteurService as;
	
		
		@GetMapping(value="{id}")
		public Secteur findById(@PathVariable("id") Long id) {
			return as.findById(id);
		}
	
	
		@GetMapping(value="")
		public List<Secteur> findAll() {
			return as.findAll();
		}
		
		
		@PostMapping(value="")
		public Secteur save(@RequestBody Secteur secteur) {
			return as.save(secteur);
		}
	
	
		@RequestMapping(value="{id}/delete")
		public Secteur deleteSecteur(@PathVariable("id") Long id) {
			return as.deleteById(id);
		}
	
	
	
}
