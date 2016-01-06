package com.suptrip.dao;

import java.util.List;

import com.suptrip.model.Chambre;

public interface ChambreDao {

	Chambre addChambre(Chambre Chambre);

	public Chambre findChambreById(Long id);

	public List<Chambre> getAllChambre();

	public void updateChambre(Chambre Chambre);

	public void removeChambre(Chambre Chambre);
}
