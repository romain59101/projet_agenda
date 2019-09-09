package com.example.services;

import java.util.List;

import com.example.models.Client;

public interface ClientService {

	public List<Client> findAll();
	public Client save(Client client);
	public Client findById(Long id);
	public Client deleteById(Long id);
	
}
