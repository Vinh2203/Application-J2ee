package com.suptrip.jpa;


import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.CampusDao;
import com.suptrip.model.Campus;

public class JpaCampusDao extends AbstractDao<Campus, Long> implements CampusDao {

	protected JpaCampusDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Campus addCampus(Campus Campus) {
		return persist(Campus);
		
	}

	@Override
	public Campus findCampusById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Campus> getAllCampus() {
		
		return findAll();
	}

	@Override
	public void updateCampus(Campus Campus) {
		 update(Campus);
		
	}

	@Override
	public void removeCampus(Campus Campus) {
		remove(Campus);
		
	}

}
