package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.models.CategorieRdv;
import com.example.services.CategorieRdvService;

@Controller
@RequestMapping(value="./api/categoriesRdv")
public class CategorieRdvController {
	
	@Autowired 
	CategorieRdvService catSer;
	
	@GetMapping(value="/{id}")
	public CategorieRdv findById(@PathVariable ("id") Long id) {
		return catSer.findById(id);
	}

	@GetMapping(value="")
	public List<CategorieRdv> findAll() {
		return catSer.findAll();
	}
	
	@PostMapping(value="")
	public CategorieRdv save(@RequestBody CategorieRdv categorieRdv) {
		return catSer.save(categorieRdv);
	}
	
	@RequestMapping(value="/{id}/delete")
	public CategorieRdv delete(@PathVariable("id") Long id) {
		return catSer.delete(id);
	}
	
}
