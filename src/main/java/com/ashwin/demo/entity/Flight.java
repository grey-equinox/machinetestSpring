package com.ashwin.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="flight")
public class Flight {
	
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer flightId;
	
	private String flightName;
	
	@OneToMany(mappedBy="flight", cascade=CascadeType.ALL)
	private List<Itinerary> itineraries = new ArrayList<Itinerary>();

	//default constructor
	public Flight() {
		super();
	}

	//parametrized constructors
	public Flight(Integer flightId, String flightName, List<Itinerary> itineraries) {
		super();
		this.flightId = flightId;
		this.flightName = flightName;
		this.itineraries = itineraries;
	}

	// getters and setters
	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	@JsonManagedReference
	public List<Itinerary> getItineraries() {
		return itineraries;
	}

	public void setItineraries(List<Itinerary> itineraries) {
		this.itineraries = itineraries;
	}

	
}
