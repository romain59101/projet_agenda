package com.example.services;

import java.util.List;

import com.example.models.CategorieRdv;

public interface CategorieRdvService {

	public CategorieRdv findById(Long id);
	
	public List<CategorieRdv> findAll();
	
	public CategorieRdv save(CategorieRdv categorieRdv);
	
	public CategorieRdv delete(Long id);
	
}
