package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.CategorieRdv;
import com.example.repositories.CategorieRdvRepository;

@Service
public class CategorieRdvServiceImpl implements CategorieRdvService{

	
	@Autowired
	private CategorieRdvRepository catRep;
	
	
	@Override
	public CategorieRdv findById(Long id) {
		return catRep.findById(id).get();
	}

	@Override
	public List<CategorieRdv> findAll() {
		return catRep.findAll();
	}

	@Override
	public CategorieRdv save(CategorieRdv categorieRdv) {
		return catRep.save(categorieRdv);
	}

	@Override
	public CategorieRdv delete(Long id) {
		CategorieRdv temp = findById(id);
		catRep.deleteById(id);
		return temp;
	}

}
