package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.Rdv;
import com.example.services.RdvService;

@Controller
@RequestMapping(value="./api/rdv")
public class RdvController {

	@Autowired
	private RdvService rdvSer;
	
	
	@GetMapping(value="/{id}")
	public Rdv findById(@PathVariable("id") Long id) {
		return rdvSer.findById(id);
	}
	
	@GetMapping(value="")
	public List<Rdv> findAll(){
		return rdvSer.findAll();
	}
	
	@PostMapping(value="")
	public Rdv save(Rdv rdv) {
		return rdvSer.save(rdv);
	}
	
	@RequestMapping(value="{id}/delete")
	public Rdv delete(@PathVariable ("id") Long id) {
		return rdvSer.delete(id);
	}
	
	
}
