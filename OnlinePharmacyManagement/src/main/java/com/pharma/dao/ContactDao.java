package com.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharma.entities.Contact;

public interface ContactDao extends JpaRepository<Contact, Integer>{

}
