package com.pharma.services;

import java.util.List;

import com.pharma.entities.UserRegister;

public interface UserService {
	
	public List<UserRegister> getUsers();
	
	public UserRegister getUsers (int userId);
	
	public UserRegister addUser(UserRegister user);


}
