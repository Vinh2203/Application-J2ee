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
@Table(name = "panierTemporaire")
public class PanierTemporaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_panier_temp")
	private Long id_panier_temp;
	

	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_booster")
	private User user;
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_trip")
	private Trip trip;
	 
	public  PanierTemporaire() {
		// TODO Auto-generated constructor stub
	}

	
	public PanierTemporaire(Long id_panier_temp, User user, Trip trip) {
		super();
		this.id_panier_temp = id_panier_temp;
		this.user = user;
		this.trip = trip;
	}


	public Trip getTrip() {
		return trip;
	}

	public void setTrip(Trip trip) {
		this.trip = trip;
	}

	public Long getId_panier() {
		return id_panier_temp;
	}

	public void setId_panier(Long id_panier) {
		this.id_panier_temp = id_panier;
	}


	public Long getId_panier_temp() {
		return id_panier_temp;
	}


	public void setId_panier_temp(Long id_panier_temp) {
		this.id_panier_temp = id_panier_temp;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	
}
