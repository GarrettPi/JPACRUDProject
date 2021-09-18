package com.skilldistillery.jpacrud.data;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.jpacrud.entities.Personnel;


@Service
@Transactional
public class TransporterDaoImpl implements TransporterDAO {

	@Override
	public Personnel findById(int id) {
		return null;
	}

	@Override
	public List<Personnel> findAll() {
		String jpql = "SELECT p FROM Personnel p";
		
		
		
		return null;
	}

}
