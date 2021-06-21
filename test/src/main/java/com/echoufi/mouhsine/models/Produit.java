package com.echoufi.mouhsine.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Produit {

	 @Id
	 @GeneratedValue
	private Long id;
	private String nom;
	private String categoris;
	
	
	
	public Produit() {
		super();
	}
	
	public Produit(String nom, String categoris) {
		super();
		this.nom = nom;
		this.categoris = categoris;
	}

	public Produit(Long id, String nom, String categoris) {
		super();
		this.id = id;
		this.nom = nom;
		this.categoris = categoris;
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
	public String getCategoris() {
		return categoris;
	}
	public void setCategoris(String categoris) {
		this.categoris = categoris;
	}
}
