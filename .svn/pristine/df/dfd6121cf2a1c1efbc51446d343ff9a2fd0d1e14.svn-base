package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.TypeTransportDao;
import com.suptrip.model.TypeTransport;

public class JpaTypeTransportDao extends AbstractDao<TypeTransport, Long> implements TypeTransportDao {

	protected JpaTypeTransportDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public TypeTransport addTypeTransport(TypeTransport TypeTransport) {
		return persist(TypeTransport);
		
	}

	@Override
	public TypeTransport findTypeTransportById(Long id) {

		return findById(id);
	}

	@Override
	public List<TypeTransport> getAllTypeTransport() {

		return findAll();

	}

	@Override
	public void updateTypeTransport(TypeTransport TypeTransport) {
		update(TypeTransport);
		
	}

	@Override
	public void removeTypeTransport(TypeTransport TypeTransport) {

		remove(TypeTransport);
	}

}
