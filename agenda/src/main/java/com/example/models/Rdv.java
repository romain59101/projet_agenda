package com.example.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import ch.qos.logback.core.net.server.Client;

@Entity
@Table( name= "rdv")
public class Rdv {

	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	@OneToOne
	@JoinColumn (name= "id_user")
	private Utilisateur utilisateur;
	
	@OneToOne
	@JoinColumn (name= "id_client")
	private Client client;
	
	@OneToOne
	@JoinColumn (name = "id_rdv")
	private Agenda agenda;
	
	@OneToOne
	@JoinColumn (name="id.categorie")
	private CategorieRDV categorie;
	
	
	public Rdv() {}


	public Rdv(Long id, String nom, Utilisateur utilisateur, Client client, Agenda agenda, CategorieRDV categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.utilisateur = utilisateur;
		this.client = client;
		this.agenda = agenda;
		this.categorie = categorie;
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


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Client getClient() {
		return client;
	}


	public void setClient(Client client) {
		this.client = client;
	}


	public Agenda getAgenda() {
		return agenda;
	}


	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}


	public CategorieRDV getCategorie() {
		return categorie;
	}


	public void setCategorie(CategorieRDV categorie) {
		this.categorie = categorie;
	}
	
}
