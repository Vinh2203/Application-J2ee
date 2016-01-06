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
@Table (name="options")
public class Option {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="id_option")
	private Long idOption;
	
	@OneToOne(cascade = CascadeType.DETACH , fetch = FetchType.EAGER)
	@JoinColumn (name="id_transport")
	private Transport transport;
	
	@OneToOne(cascade = CascadeType.DETACH , fetch = FetchType.EAGER)
	@JoinColumn (name="id_chambre")
	private Chambre chambre;
	public Option() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Option(Long idOption, Transport transport, com.suptrip.model.Chambre chambre) {
		super();
		this.idOption = idOption;
		this.transport = transport;
		this.chambre = chambre;
	}

	
	public Transport getTransport() {
		return transport;
	}


	public void setTransport(Transport transport) {
		this.transport = transport;
	}


	public Chambre getChambre() {
		return this.chambre;
	}


	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}


	public Long getIdOption() {
		return idOption;
	}
	public void setIdOption(Long idOption) {
		this.idOption = idOption;
	}
	
}
