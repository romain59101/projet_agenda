package com.example.services;


import com.example.models.Agenda;

public interface AgendaService {
	
	public Agenda save(Agenda agenda);
	public Agenda findById(Long id);
	public Agenda deleteById(Long id);

}
