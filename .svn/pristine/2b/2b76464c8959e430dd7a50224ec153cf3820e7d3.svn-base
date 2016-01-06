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
@Table(name = "campus")
public class Campus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_campus")
	private Long idCampus;

	@Column(name = "name")
	private String name;
	

	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_ville")
	private Ville ville;
	
	public Campus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Campus(Long idCampus, String name, Ville ville) {
		super();
		this.idCampus = idCampus;
		this.name = name;
		this.ville = ville;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Long getIdCampus() {
		return idCampus;
	}

	public void setIdCampus(Long idCampus) {
		this.idCampus = idCampus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
