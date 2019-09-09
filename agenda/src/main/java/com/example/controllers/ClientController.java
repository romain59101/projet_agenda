package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.models.Client;
import com.example.services.ClientService;

@RestController
@RequestMapping(value="/api/clients")
															//Si on ajoute la sécurité : @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")  ou   @PreAuthorize("permitAll()")
public class ClientController {

	
		@Autowired
		private ClientService as;
	
		
		@GetMapping(value="{id}")
		public Client findById(@PathVariable("id") Long id) {
			return as.findById(id);
		}
	
	
		@GetMapping(value="")
		public List<Client> findAll() {
			return as.findAll();
		}
		
		
		@PostMapping(value="")
		public Client save(@RequestBody Client client) {
			return as.save(client);
		}
	
	
		@RequestMapping(value="{id}/delete")
		public Client deleteClient(@PathVariable("id") Long id) {
			return as.deleteById(id);
		}
	
	
	
}

