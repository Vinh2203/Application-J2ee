package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.TripDao;
import com.suptrip.model.Trip;

public class JpaTripDao extends AbstractDao<Trip, Long> implements TripDao{

	protected JpaTripDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Trip addTrip(Trip Trip) {
		return persist(Trip);
		
	}

	@Override
	public Trip findTripById(Long id) {

		return findById(id);
	}

	@Override
	public List<Trip> getAllTrip() {

		return findAll();

	}

	@Override
	public void updateTrip(Trip Trip) {
		update(Trip);
		
	}

	@Override
	public void removeTrip(Trip Trip) {
		remove(Trip);
		
	}

}
