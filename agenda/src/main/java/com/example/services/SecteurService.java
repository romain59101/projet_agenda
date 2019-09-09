package com.example.services;

import java.util.List;

import com.example.models.Secteur;

public interface SecteurService {
	
	public List<Secteur> findAll();
	public Secteur save(Secteur secteur);
	public Secteur deleteById(Long id);
	public Secteur findById(Long id);

}
