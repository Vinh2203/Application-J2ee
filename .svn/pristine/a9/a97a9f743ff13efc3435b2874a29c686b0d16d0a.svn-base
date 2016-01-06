package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.CommandeDao;
import com.suptrip.model.Commande;

public class JpaCommandeDao extends AbstractDao<Commande, Long> implements CommandeDao {

	protected JpaCommandeDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Commande addCommande(Commande Commande) {
		return persist(Commande);
		
	}

	@Override
	public Commande findCommandeById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Commande> getAllCommande() {
		
		return findAll();
	}

	@Override
	public void updateCommande(Commande Commande) {
		update(Commande);
	}

	@Override
	public void removeCommande(Commande Commande) {
		remove(Commande);
		
	}

}
