package com.pharma.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharma.dao.BookMedicineDao;
import com.pharma.entities.BookMedicine;

@Service
public class BookMedicineServiceImplement implements BookMedicineService{
	
	@Autowired
	private BookMedicineDao bookDao;
	
	public BookMedicineServiceImplement() {
	}

				//GET ALL BOOK MEDICINE
	@Override
	public List<BookMedicine> getbookmed() {
		
		return bookDao.findAll();
	}

				//GET SINGLE MEDICINE BOOKED
	@Override
	public BookMedicine getbookmed(int medId) {
		return bookDao.findById(medId).get();
	}

	@Override
	public BookMedicine addbookmed(BookMedicine medbook) {
		
		bookDao.save(medbook);
		return medbook;
	}

	@Override
	public BookMedicine updatebookmed(BookMedicine medbook) {
		bookDao.save(medbook);
		return medbook;
	}

	
	@Override
	public void deletebookMedicine(int bookmedicineId) {
		// TODO Auto-generated method stub
		bookDao.deleteById(bookmedicineId);
	}

}
