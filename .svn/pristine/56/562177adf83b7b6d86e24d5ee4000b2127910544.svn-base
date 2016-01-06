package com.suptrip.jpa;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.suptrip.dao.AbstractDao;
import com.suptrip.dao.UserDao;

import com.suptrip.model.User;

public class JpaUserDao extends AbstractDao<User, Long> implements UserDao {

	

	protected JpaUserDao(EntityManagerFactory emf) {
		super(emf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public User addUser(User User) {
		return persist(User);
		
	}

	@Override
	public User findUserById(Long id) {

		return findById(id);
	}

	@Override
	public List<User> getAllUser() {

		return findAll();

	}

	@Override
	public void updateUser(User User) {
		update(User);
		
	}

	@Override
	public void removeUser(User User) {
		remove(User);
		
	}

}
