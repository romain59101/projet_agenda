package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.models.Contact;
import com.example.repositories.ContactRepository;

public class ContactServiceImp implements ContactService{

	@Autowired
	private ContactRepository contactRepository;
	
	@Override
	public List<Contact> findAll() {	
		return contactRepository.findAll();
	}

	@Override
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	public Contact findById(Long id) {
		return contactRepository.findById(id).get();
	}

	@Override
	public Contact deleteById(Long id) {
		Contact temp = findById(id);
		contactRepository.deleteById(id);
		return temp;
	}

}
