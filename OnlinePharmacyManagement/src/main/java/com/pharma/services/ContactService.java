package com.pharma.services;

import java.util.List;

import com.pharma.entities.Contact;

public interface ContactService {
	
	public List<Contact> getContact();
	
	public Contact addContact(Contact contact);

}
