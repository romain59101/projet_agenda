package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.models.Adresse;
import com.example.repositories.AdresseRepository;

@Service
public class AdresseServiceImp implements AdresseService{

		@Autowired
		private AdresseRepository adresseRepository;

		@Override
		public List<Adresse> findAll() {
			return adresseRepository.findAll();
		}
	
		@Override
		public Adresse save(Adresse adresse) {
			return adresseRepository.save(adresse);
		}
	
		@Override
		public Adresse findById(Long id) {
			return adresseRepository.findById(id).get();
		}
	
		@Override
		public Adresse deleteById(Long id) {
			Adresse temp = findById(id);
			adresseRepository.deleteById(id);
			return temp;
		}
	

}
