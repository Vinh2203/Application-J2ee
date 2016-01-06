package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.TransportDao;
import com.suptrip.model.Transport;

public class JpaTransportDao extends AbstractDao<Transport, Long> implements TransportDao{

	protected JpaTransportDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Transport addTransport(Transport Transport) {
		return persist(Transport);
		
	}

	@Override
	public Transport findTransportById(Long id) {

		return findById(id);
	}

	@Override
	public List<Transport> getAllTransport() {

		return null;
	}

	@Override
	public void updateTransport(Transport Transport) {
		update(Transport);
		
	}

	@Override
	public void removeTransport(Transport Transport) {
		remove(Transport);
		
	}

}
