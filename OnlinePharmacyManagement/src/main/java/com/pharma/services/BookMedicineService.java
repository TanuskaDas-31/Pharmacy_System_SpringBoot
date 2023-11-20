package com.pharma.services;

import java.util.List;

import com.pharma.entities.BookMedicine;

public interface BookMedicineService {
	//GET ALL BOOKED 
		public List<BookMedicine> getbookmed();
		
		//GET SINGLE BOOKED 
		public BookMedicine getbookmed(int medId);
		
		//ADD NEW BOOKED 
		public BookMedicine addbookmed(BookMedicine medbook);
		
		//UPDATE BOOKED 
		public BookMedicine updatebookmed(BookMedicine medbook);
		
		//DELETE BOOKED
		public void deletebookMedicine(int bookmedicineId);

}
