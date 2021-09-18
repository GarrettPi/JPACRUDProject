package com.skilldistillery.jpacrud.data;

import java.util.List;

import com.skilldistillery.jpacrud.entities.Personnel;

public interface TransporterDAO {

	Personnel findById(int id);
	List<Personnel> findAll();
	Personnel updateRecord(Personnel personnel);
}
