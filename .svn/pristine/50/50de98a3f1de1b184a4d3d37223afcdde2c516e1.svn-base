package com.suptrip.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.suptrip.dao.CampusDao;
import com.suptrip.dao.ChambreDao;
import com.suptrip.dao.CommandeDao;
import com.suptrip.dao.DaoFactory;
import com.suptrip.dao.HotelDao;
import com.suptrip.dao.OptionDao;
import com.suptrip.dao.PanierDao;
import com.suptrip.dao.PanierTemporaireDao;
import com.suptrip.dao.TransportDao;
import com.suptrip.dao.TripDao;
import com.suptrip.dao.TypeTransportDao;
import com.suptrip.dao.UserDao;
import com.suptrip.dao.VilleDao;

public class JpaDaoFactory extends DaoFactory {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
	private JpaCampusDao campus;
	private JpaUserDao user;
	private JpaHotelDao hotel;
	private JpaVilleDao ville;
	private JpaTransportDao transport;
	private JpaCommandeDao commande;
	private JpaTripDao trip;
	private JpaOptionDao option;
	private JpaChambreDao chambre;
	private JpaTypeTransportDao type;
	private JpaPanierDao panier;
	private JpaPanierTemporaire panierTemp;
	@Override
	public UserDao getUserDao() {
		if (user == null) {
			user = new JpaUserDao(emf);
		}
		return user;
	}

	@Override
	public CampusDao getCampusDao() {
		if (campus == null) {
			campus = new JpaCampusDao(emf);
		}
		return campus;
	}

	@Override
	public VilleDao getVilleDao() {
		if (ville == null) {
			ville = new JpaVilleDao(emf);
		}
		return ville;
	}

	@Override
	public OptionDao getOptionDao() {
		if (option == null) {
			option = new JpaOptionDao(emf);
		}
		return option;
	}

	@Override
	public TransportDao getTransportDao() {
		if (transport == null) {
			transport = new JpaTransportDao(emf);
		}
		return transport;
	}

	@Override
	public TripDao getTripDao() {
		if (trip == null) {
			trip = new JpaTripDao(emf);
		}
		return trip;
	}

	@Override
	public ChambreDao getChambreDao() {
		if (chambre == null) {
			chambre = new JpaChambreDao(emf);
		}
		return chambre;
	}

	@Override
	public CommandeDao getCommandeDao() {
		if (commande == null) {
			commande = new JpaCommandeDao(emf);
		}
		return commande;
	}

	@Override
	public PanierDao getPanierDao() {
		if (panier == null) {
			panier = new JpaPanierDao(emf);
		}
		return panier;
	}
	
	@Override
	public TypeTransportDao getTypeTransportDao() {
		if (type == null) {
			type = new JpaTypeTransportDao(emf);
		}
		return type;
	}

	@Override
	public HotelDao getHotelDao() {
		if (hotel == null) {
			hotel = new JpaHotelDao(emf);
		}
		return hotel;
	}

	@Override
	public PanierTemporaireDao getPanierTemporaireDao() {
		if (panierTemp == null) {
			panierTemp = new JpaPanierTemporaire(emf);
		}
		return panierTemp;
	}

}
