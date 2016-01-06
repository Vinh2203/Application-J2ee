package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;

import com.suptrip.dao.PanierTemporaireDao;

import com.suptrip.model.PanierTemporaire;

public class JpaPanierTemporaire extends AbstractDao<PanierTemporaire, Long> implements PanierTemporaireDao {

	protected JpaPanierTemporaire(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addPanierTemporaire(PanierTemporaire Panier) {
		persist(Panier);
	}

	@Override
	public PanierTemporaire findPanierTemporaireById(Long id) {
		return findById(id);
	}

	@Override
	public List<PanierTemporaire> getAllPanierTemporaire() {

		return findAll();
	}

	@Override
	public void updatePanierTemporaire(PanierTemporaire Panier) {
		update(Panier);
	}

	@Override
	public void removePanierTemporaire(PanierTemporaire Panier) {
		remove(Panier);

	}

}
