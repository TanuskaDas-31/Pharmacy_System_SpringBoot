package com.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.entities.BookMedicine;

@Repository
public interface  BookMedicineDao extends JpaRepository <BookMedicine,Integer>{

}
