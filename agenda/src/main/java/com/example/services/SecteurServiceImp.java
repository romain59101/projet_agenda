package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Secteur;
import com.example.repositories.SecteurRepository;

public class SecteurServiceImp implements SecteurService{

	@Autowired
	private SecteurRepository secteurRepository;


	@Override
	public List<Secteur> findAll() {
		return secteurRepository.findAll();
	}

	@Override
	public Secteur save(Secteur secteur) {
		return secteurRepository.save(secteur);
	}

	@Override
	public Secteur deleteById(Long id) {
		Secteur temp = findById(id);
		secteurRepository.deleteById(id);
		return temp;
	}

	@Override
	public Secteur findById(Long id) {
		return secteurRepository.findById(id).get();
	}

}
