package com.suptrip.dao;

import java.util.List;

import com.suptrip.model.Campus;

public interface CampusDao {
	Campus addCampus(Campus Campus);

	public Campus findCampusById(Long id);

	public List<Campus> getAllCampus();

	public void updateCampus(Campus Campus);

	public void removeCampus(Campus Campus);
}
