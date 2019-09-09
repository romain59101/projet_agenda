package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Client;
import com.example.repositories.ClientRepository;

public class ClientServiceImp implements ClientService{

	
	@Autowired
	private ClientRepository clientRepository;



	@Override
	public List<Client> findAll() {
		return clientRepository.findAll();
	}

	@Override
	public Client save(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public Client findById(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public Client deleteById(Long id) {
		Client temp = findById(id);
		clientRepository.deleteById(id);
		return temp;
	}

}