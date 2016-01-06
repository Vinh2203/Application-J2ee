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
@Table(name = "transport")
public class Transport {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_transport")
	private Long idTransport;
	
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_type_transport")
	private TypeTransport idType;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "date_dept")
	private Date dateDept;

	@Temporal(TemporalType.DATE)
	@Column(name = "date_retour")
	private Date dateRetour;
	
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ville_dept", referencedColumnName = "id_ville")
	private Ville ville_dept;
	 
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ville_arrive", referencedColumnName = "id_ville")
	private Ville ville_arrive;

	@Column(name = "nombre_place")
	private int nombrePlace;

	@Column(name = "prix")
	private float prix;

	public Transport() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transport(Long idTransport,TypeTransport idType, Date dateDept, Date dateRetour, Ville ville_dept,
			Ville ville_arrive, int nombrePlace, float prix) {
		super();
		this.idTransport = idTransport;
		this.idType = idType;
		this.dateDept = dateDept;
		this.dateRetour = dateRetour;
		this.ville_dept = ville_dept;
		this.ville_arrive = ville_arrive;
		this.nombrePlace = nombrePlace;
		this.prix = prix;
	}

	public TypeTransport getIdType() {
		return idType;
	}

	public void setIdType(TypeTransport idType) {
		this.idType = idType;
	}

	public Ville getVille_dept() {
		return this.ville_dept;
	}

	public void setVille_dept(Ville ville_dept) {
		this.ville_dept = ville_dept;
	}

	public Ville getVille_arrive() {
		return ville_arrive;
	}

	public void setVille_arrive(Ville ville_arrive) {
		this.ville_arrive = ville_arrive;
	}

	public Long getIdTransport() {
		return idTransport;
	}

	public void setIdTransport(Long idTransport) {
		this.idTransport = idTransport;
	}

	public Date getDateDept() {
		return dateDept;
	}

	public void setDateDept(Date dateDept) {
		this.dateDept = dateDept;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}

	public int getNombrePlace() {
		return nombrePlace;
	}

	public void setNombrePlace(int nombrePlace) {
		this.nombrePlace = nombrePlace;
	}

	public float getPrix() {
		return prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}
	
	
}
