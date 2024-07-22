package com.tap.dao;

import java.util.List;



import com.tap.model.User;


public interface UserDAO {
	

	void addUser(User user);
	User getUser(int userId);
	void updateUser(User user);
	void deleteUser(int userId);
	List<User> getAllUsers();
	
	
	
void addUserSignup(User user);
User getUserByUsernameAndPassword(String username, String password);



}