package com.skilldistillery.jpacrud.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Personnel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String rank;
	
	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;
	
	@Column(name="departure_location")
	private String departureLocation;
	
	private String destination;

//	private DateTime time;
	
	public Personnel() {
		super();
	}

	public Personnel(int id, String rank, String firstName, String lastName, String departureLocation,
			String destination) {
		super();
		this.id = id;
		this.rank = rank;
		this.firstName = firstName;
		this.lastName = lastName;
		this.departureLocation = departureLocation;
		this.destination = destination;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartureLocation() {
		return departureLocation;
	}

	public void setDepartureLocation(String departureLocation) {
		this.departureLocation = departureLocation;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return "Personnel [id=" + id + ", rank=" + rank + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", departureLocation=" + departureLocation + ", destination=" + destination + "]";
	}
	


}
