package com.suptrip.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "panier")
public class Panier {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_panier")
	private Long id_panier;

	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_trip")
	private Trip trip;
	 
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_commande")
	private Commande commande;

	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Panier(Long id_panier, Trip trip, Commande commande) {
		super();
		this.id_panier = id_panier;
		this.trip = trip;
		this.commande = commande;
	}

	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public Long getId_panier() {
		return id_panier;
	}

	public void setId_panier(Long id_panier) {
		this.id_panier = id_panier;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	
	
}
