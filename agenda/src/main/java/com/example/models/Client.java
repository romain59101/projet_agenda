package com.example.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	public String societe;
	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="contact_id")
	private Contact contact;
	
	@ManyToOne
	@JoinColumn(name="secteur")
	private Secteur secteur;
	
	@OneToMany(mappedBy="client")
	@JsonIgnore
	private Set<Rdv> rdvs = new HashSet<Rdv>();
	
	Client() {}

	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSociete() {
		return societe;
	}

	public void setSociete(String societe) {
		this.societe = societe;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Secteur getSecteur() {
		return secteur;
	}

	public void setSecteur(Secteur secteur) {
		this.secteur = secteur;
	}





	public Client(Long id, String societe) {
		super();
		this.id = id;
		this.societe = societe;
	}



	public Client(Long id, String societe, Adresse adresse, Contact contact, Secteur secteur) {
		super();
		this.id = id;
		this.societe = societe;
		this.adresse = adresse;
		this.contact = contact;
		this.secteur = secteur;
	}



}
