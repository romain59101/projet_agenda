package com.example.services;

import java.util.List;

import com.example.models.Rdv;

public interface RdvService {

	
	public Rdv findById(Long id);
	
	public List<Rdv> findAll();
	
	public Rdv save(Rdv rdv);
	
	public Rdv delete(Long id);
	
}
