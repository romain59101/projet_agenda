package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Adresse;
import com.example.services.AdresseService;

@RestController
@RequestMapping(value="/api/adresses")
															//Si on ajoute la sécurité : @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")  ou   @PreAuthorize("permitAll()")
public class AdresseController {

	
		@Autowired
		private AdresseService as;
	
		
		@GetMapping(value="{id}")
		public Adresse findById(@PathVariable("id") Long id) {
			return as.findById(id);
		}
	
	
		@GetMapping(value="")
		public List<Adresse> findAll() {
			return as.findAll();
		}
		
		
		@PostMapping(value="")
		public Adresse save(@RequestBody Adresse adresse) {
			return as.save(adresse);
		}
	
	
		@RequestMapping(value="{id}/delete")
		public Adresse deleteAdresse(@PathVariable("id") Long id) {
			return as.deleteById(id);
		}
	
	
	
}
