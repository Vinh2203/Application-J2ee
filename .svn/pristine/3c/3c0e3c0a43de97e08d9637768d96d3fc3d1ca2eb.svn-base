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
@Table (name="chambre")
public class Chambre {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="id_chambre")
	private Long id_chambre;
	
	@ManyToOne(cascade = CascadeType.DETACH , fetch = FetchType.EAGER)
	@JoinColumn (name="id_hotel")
	private Hotel hotel;
	
	@Column (name="type_chambre")
	private String type_chambre;
	
	@Column (name="nombre_personne")
	private int nombrePersonne;
	
	@Column (name="prix")
	private float prix;
	
	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Chambre(Long id_chambre, Hotel hotel, String type_chambre, int nombrePersonne, float prix) {
		super();
		this.id_chambre = id_chambre;
		this.hotel = hotel;
		this.type_chambre = type_chambre;
		this.nombrePersonne = nombrePersonne;
		this.prix = prix;
	}

	
	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Long getId_chambre() {
		return id_chambre;
	}
	public void setId_chambre(Long id_chambre) {
		this.id_chambre = id_chambre;
	}
	
	public String getType_chambre() {
		return type_chambre;
	}
	public void setType_chambre(String type_chambre) {
		this.type_chambre = type_chambre;
	}
	public int getNombrePersonne() {
		return nombrePersonne;
	}
	public void setNombrePersonne(int nombrePersonne) {
		this.nombrePersonne = nombrePersonne;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
}
