package com.suptrip.dao;

import com.suptrip.jpa.JpaDaoFactory;

public abstract class DaoFactory {
	
	public static DaoFactory getDaoFactory() {
		return new JpaDaoFactory();
	}
	
	public abstract UserDao getUserDao();
	public abstract CampusDao getCampusDao();
	public abstract VilleDao getVilleDao();
	public abstract OptionDao getOptionDao();
	public abstract TransportDao getTransportDao();
	public abstract TripDao getTripDao();
	public abstract ChambreDao getChambreDao();
	public abstract CommandeDao getCommandeDao();
	public abstract TypeTransportDao getTypeTransportDao();
	public abstract HotelDao getHotelDao();
	public abstract PanierDao getPanierDao();
	public abstract PanierTemporaireDao getPanierTemporaireDao();
	
	
}
