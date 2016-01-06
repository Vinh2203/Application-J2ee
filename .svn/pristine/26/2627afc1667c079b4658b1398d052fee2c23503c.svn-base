package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.HotelDao;
import com.suptrip.model.Hotel;

public class JpaHotelDao extends AbstractDao<Hotel, Long> implements HotelDao {

	protected JpaHotelDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Hotel addHotel(Hotel Hotel) {
		return persist(Hotel);
		
	}

	@Override
	public Hotel findHotelById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Hotel> getAllHotel() {
		
		return findAll();
	}

	@Override
	public void updateHotel(Hotel Hotel) {
		update(Hotel);
	}

	@Override
	public void removeHotel(Hotel Hotel) {
		remove(Hotel);
		
	}

}
