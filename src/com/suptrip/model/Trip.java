package com.suptrip.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement(name="trip")
@Entity
@Table(name = "trip")
public class Trip {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_trip")
	@XmlAttribute(name="id-trip")
	private Long idTrip;
	
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_option")
	@XmlElement(name="id-option")
	private Option option;
	
	
	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_campus")
	@XmlElement(name="id-campus")
	private Campus campus;
	
	public Trip() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trip(Long idTrip,Option option, Campus campus) {
		super();
		this.idTrip = idTrip;
		this.option = option;
		this.campus = campus;
	}
	@XmlTransient
	public Option getOption() {
		return option;
	}

	public void setOption(Option option) {
		this.option = option;
	}
	@XmlTransient 
	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}
	@XmlTransient 
	public Long getIdTrip() {
		return idTrip;
	}

	public void setIdTrip(Long idTrip) {
		this.idTrip = idTrip;
	}
	
	public static List<Trip> getListTrip(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    	EntityManager em = emf.createEntityManager();
		
		Query q = em.createQuery("SELECT p FROM Trip as p");
		@SuppressWarnings("unchecked")
		List<Trip> result = (List<Trip>) q.getResultList();
		em.close();
		emf.close();
		
		return result;
	}
	
	
}
