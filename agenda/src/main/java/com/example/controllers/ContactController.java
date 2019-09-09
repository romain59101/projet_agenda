package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Contact;
import com.example.services.ContactService;

@RestController
@RequestMapping(value="/api/adresses")
															//Si on ajoute la sécurité : @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")  ou   @PreAuthorize("permitAll()")
public class ContactController {

	
		@Autowired
		private ContactService as;
	
		
		@GetMapping(value="{id}")
		public Contact findById(@PathVariable("id") Long id) {
			return as.findById(id);
		}
	
	
		@GetMapping(value="")
		public List<Contact> findAll() {
			return as.findAll();
		}
		
		
		@PostMapping(value="")
		public Contact save(@RequestBody Contact contact) {
			return as.save(contact);
		}
	
	
		@RequestMapping(value="{id}/delete")
		public Contact deleteContact(@PathVariable("id") Long id) {
			return as.deleteById(id);
		}
	
	
	
}
