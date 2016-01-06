package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.ChambreDao;
import com.suptrip.model.Chambre;

public class JpaChambreDao extends AbstractDao<Chambre, Long> implements ChambreDao {

	protected JpaChambreDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Chambre addChambre(Chambre Chambre) {
		return persist(Chambre);
		
	}

	@Override
	public Chambre findChambreById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Chambre> getAllChambre() {
		
		return findAll();
	}

	@Override
	public void updateChambre(Chambre Chambre) {
		update(Chambre);
		
	}

	@Override
	public void removeChambre(Chambre Chambre) {
		remove(Chambre);
		
	}

}
