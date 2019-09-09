package com.example.models;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	
	public Calendar dateDebut;
	
	@ManyToOne(mappedBy="agenda")
	public Rdv rdv;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Calendar getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Calendar dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Calendar getDateFin() {
		return dateFin;
	}

	public void setDateFin(Calendar dateFin) {
		this.dateFin = dateFin;
	}

	public Calendar dateFin;
	
	public Agenda() {}

	public Agenda(Long id, Calendar dateDebut, Calendar dateFin) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}


	
	
	
	

}
