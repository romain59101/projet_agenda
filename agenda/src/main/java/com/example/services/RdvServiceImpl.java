package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Rdv;
import com.example.repositories.RdvRepository;

@Service
public class RdvServiceImpl implements RdvService{

	
	@Autowired
	private RdvRepository rdvRep;

	@Override
	public Rdv findById(Long id) {
		return rdvRep.findById(id).get();
	}

	@Override
	public List<Rdv> findAll() {
		return rdvRep.findAll();
	}

	@Override
	public Rdv save(Rdv rdv) {
		return rdvRep.save(rdv) ;
	}

	@Override
	public Rdv delete(Long id) {
		Rdv temp = findById(id);
		rdvRep.deleteById(id);
		return temp;
	}
	
	
	
}
