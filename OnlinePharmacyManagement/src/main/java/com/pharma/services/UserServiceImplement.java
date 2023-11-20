package com.pharma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.dao.UserDao;
import com.pharma.entities.UserRegister;

@Service
public class UserServiceImplement implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	public UserServiceImplement() {
	}

	//GET ALL USER
	@Override
	public List<UserRegister> getUsers() {
		
		return userDao.findAll();
	}
	//GET SINGLE USER
	@Override
	public UserRegister getUsers(int userId) {
	
		return userDao.findById(userId).get();
	}

	//ADD USER
	@Override
	public UserRegister addUser(UserRegister user) {

		userDao.save(user);
		return user;
	}



}
