package com.pharma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.dao.ContactDao;
import com.pharma.entities.Contact;

@Service
public class ContactServiceImplement implements ContactService{
	@Autowired
	private ContactDao contactDao;

	public ContactServiceImplement() {}
	
	@Override
	public List<Contact> getContact() {
		
		return contactDao.findAll();
	}

	@Override
	public Contact addContact(Contact contact) {
		
		contactDao.save(contact);
		return contact;
		
	}

}
