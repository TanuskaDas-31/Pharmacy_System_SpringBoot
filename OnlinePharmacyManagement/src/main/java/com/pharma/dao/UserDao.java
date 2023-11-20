package com.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.entities.UserRegister;

@Repository
public interface UserDao extends JpaRepository<UserRegister, Integer>{

}
