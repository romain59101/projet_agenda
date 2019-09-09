package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Agenda;
import com.example.repositories.AgendaRepository;

public class AgendaServiceImpl implements AgendaService {
	
	@Autowired
	private AgendaRepository agendaRepository;

	@Override
	public Agenda save(Agenda agenda) {
		return agendaRepository.save(agenda);
	}

	@Override
	public Agenda findById(Long id) {
		return agendaRepository.findById(id).get();
	}

	@Override
	public Agenda deleteById(Long id) {
		Agenda temp = findById(id);
		agendaRepository.deleteById(id);
		return temp;
	}

}
