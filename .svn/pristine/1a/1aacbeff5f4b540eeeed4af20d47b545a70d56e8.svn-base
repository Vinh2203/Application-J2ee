package com.suptrip.model;


import java.util.Date;


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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "commande")
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_commande")
	private Long idCommande;

	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_booster")
	private User user;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_commande")
	private Date dateCommande;

	@Column(name = "etat_commande")
	private int etatCommande;

	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Long idCommande, User user, Date dateCommande, int etatCommande) {
		super();
		this.idCommande = idCommande;
		this.user = user;
		this.dateCommande = dateCommande;
		this.etatCommande = etatCommande;

	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public int getEtatCommande() {
		return etatCommande;
	}

	public void setEtatCommande(int etatCommande) {
		this.etatCommande = etatCommande;
	}
	

}
