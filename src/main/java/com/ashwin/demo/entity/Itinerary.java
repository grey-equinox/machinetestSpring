package com.ashwin.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="itinerary")
public class Itinerary {
	
	//instance variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer itineraryId;
	
	private Integer flightId;
	
	//Foreign key
	@ManyToOne
	@JoinColumn(name="flightId", insertable=false,updatable=false)
	private Flight flight;

	private String depAirport;
	private LocalDate depDate;
	private String depTime;
	private String time;
	private String arrAirport;
	private LocalDate arrDate;
	private String arrTime;
	
	//default constructor
	public Itinerary() {
		super();
	}

	//parametrized constructors
	public Itinerary(Integer itineraryId, Integer flightId, Flight flight, String depAirport, LocalDate depDate,
			String depTime, String time, String arrAirport, LocalDate arrDate, String arrTime) {
		super();
		this.itineraryId = itineraryId;
		this.flightId = flightId;
		this.flight = flight;
		this.depAirport = depAirport;
		this.depDate = depDate;
		this.depTime = depTime;
		this.time = time;
		this.arrAirport = arrAirport;
		this.arrDate = arrDate;
		this.arrTime = arrTime;
	}

	// getters and setters
	public Integer getItineraryId() {
		return itineraryId;
	}

	public void setItineraryId(Integer itineraryId) {
		this.itineraryId = itineraryId;
	}

	public Integer getFlightId() {
		return flightId;
	}

	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}

	@JsonBackReference
	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getDepAirport() {
		return depAirport;
	}

	public void setDepAirport(String depAirport) {
		this.depAirport = depAirport;
	}

	public LocalDate getDepDate() {
		return depDate;
	}

	public void setDepDate(LocalDate depDate) {
		this.depDate = depDate;
	}

	public String getDepTime() {
		return depTime;
	}

	public void setDepTime(String depTime) {
		this.depTime = depTime;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getArrAirport() {
		return arrAirport;
	}

	public void setArrAirport(String arrAirport) {
		this.arrAirport = arrAirport;
	}

	public LocalDate getArrDate() {
		return arrDate;
	}

	public void setArrDate(LocalDate arrDate) {
		this.arrDate = arrDate;
	}

	public String getArrTime() {
		return arrTime;
	}

	public void setArrTime(String arrTime) {
		this.arrTime = arrTime;
	}
	
	
	
	
	
}
