package com.example.services;

import java.util.List;

import com.example.models.Adresse;

public interface AdresseService {

	public List<Adresse> findAll();
	public Adresse save(Adresse adresse);
	public Adresse findById(Long id);
	public Adresse deleteById(Long id);
}
