package com.suptrip.model;



import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table (name="hotel")
public class Hotel {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="id_hotel")
	private Long id_hotel;
	
	@Column (name="nom_hotel")
	private String nom_hotel;
	
	@ManyToOne(cascade = CascadeType.DETACH , fetch = FetchType.EAGER)
	@JoinColumn (name="id_ville")
	private Ville ville;
	
	
	@Column (name="type_hotel")
	private String type_hotel;
	
	@Column (name="telephone")
	private String telephone;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Hotel(Long id_hotel, String nom_hotel, Ville ville, String type_hotel, String telephone) {
		super();
		this.id_hotel = id_hotel;
		this.nom_hotel = nom_hotel;
		this.ville = ville;
		this.type_hotel = type_hotel;
		this.telephone = telephone;
	}

	

	public Ville getVille() {
		return this.ville;
	}


	public void setVille(Ville ville) {
		this.ville = ville;
	}


	public Long getId_hotel() {
		return id_hotel;
	}

	public void setId_hotel(Long id_hotel) {
		this.id_hotel = id_hotel;
	}

	public String getNom_hotel() {
		return nom_hotel;
	}

	public void setNom_hotel(String nom_hotel) {
		this.nom_hotel = nom_hotel;
	}

	public String getType_hotel() {
		return type_hotel;
	}

	public void setType_hotel(String type_hotel) {
		this.type_hotel = type_hotel;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
