package com.example.models;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table( name = "categorieRdv")
public class CategorieRDV {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name= "CAT_Id")
	private Long id; 
	
	@Column(name= "CAT_Category")
	private String name;
	
	
	@OneToMany(mappedBy= "Category", fetch= FetchType.LAZY )
	private List<Rdv> Rdv = new LinkedList<Rdv>();
	
	public CategorieRDV () {}

	public CategorieRDV(Long id, String name, List<com.example.models.Rdv> rdv) {
		super();
		this.id = id;
		this.name = name;
		Rdv = rdv;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Rdv> getRdv() {
		return Rdv;
	}

	public void setRdv(List<Rdv> rdv) {
		Rdv = rdv;
	}
	
	
}

