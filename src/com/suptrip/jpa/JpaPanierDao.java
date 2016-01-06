package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.PanierDao;
import com.suptrip.model.Panier;

public class JpaPanierDao extends AbstractDao<Panier, Long> implements PanierDao {

	protected JpaPanierDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Panier addPanier(Panier Panier) {
		return persist(Panier);
		
	}

	@Override
	public Panier findPanierById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Panier> getAllPanier() {
		
		return findAll();
	}

	@Override
	public void updatePanier(Panier Panier) {
		update(Panier);
	}

	@Override
	public void removePanier(Panier Panier) {
		remove(Panier);
		
	}

}
