package com.example.models;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Secteur {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String nom;
	
	
	@OneToMany(mappedBy="secteur")
	@JsonIgnore
	private Set<Client> clients = new HashSet<Client>();

	public Secteur() {}
	

	public Secteur(Long id, String nom, Set<Client> clients) {
		super();
		this.id = id;
		this.nom = nom;
		this.clients = clients;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Set<Client> getClients() {
		return clients;
	}


	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	

}
