package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long>{

}
