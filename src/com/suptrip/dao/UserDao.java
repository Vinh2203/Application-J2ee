package com.suptrip.dao;

import java.util.List;
import com.suptrip.model.User;

	public interface UserDao{
		
		User addUser(User User);
		
		public User findUserById(Long id);
		
		public List<User> getAllUser();
		
		public void updateUser(User User);
		
		public void removeUser(User User);
}
