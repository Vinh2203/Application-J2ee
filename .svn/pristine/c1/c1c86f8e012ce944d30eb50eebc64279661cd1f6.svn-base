package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.OptionDao;
import com.suptrip.model.Option;

public class JpaOptionDao extends AbstractDao<Option, Long> implements OptionDao {

	protected JpaOptionDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Option addOption(Option Option) {
		return persist(Option);		
	}

	@Override
	public Option findOptionById(Long id) {
		
		return findById(id);
	}

	@Override
	public List<Option> getAllOption() {
		
		return findAll();
	}

	@Override
	public void updateOption(Option Option) {
		update(Option);
	}

	@Override
	public void removeOption(Option Option) {
		remove(Option);
		
	}

}
