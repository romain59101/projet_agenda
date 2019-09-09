package com.example.services;

import java.util.List;

import com.example.models.Contact;

public interface ContactService {

	public List<Contact> findAll();
	public Contact save(Contact contact);
	public Contact findById(Long id);
	public Contact deleteById(Long id);
	
}
