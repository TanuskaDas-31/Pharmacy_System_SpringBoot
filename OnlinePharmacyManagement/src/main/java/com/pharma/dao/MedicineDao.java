package com.pharma.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pharma.entities.Medicine;

@Repository
public interface MedicineDao extends JpaRepository <Medicine, Integer>{

}
