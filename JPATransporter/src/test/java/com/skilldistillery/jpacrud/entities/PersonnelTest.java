package com.skilldistillery.jpacrud.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PersonnelTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private Personnel personnel;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("JPATransporter");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		personnel = em.find(Personnel.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		personnel = null;
		em.close();
	}

	@Test
	@DisplayName("test personnel entity mapping")
	void test() {
		assertNotNull(personnel);
		assertEquals("Reginald", personnel.getFirstName());
		assertEquals("Barclay", personnel.getLastName());
	}

}
