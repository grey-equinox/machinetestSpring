package com.ashwin.demo.dto;

import java.time.LocalDate;

public class FlightDetailsDto {


	private int itineraryId;
	private int flightId;
	private String depAirport;
	private LocalDate depDate;
	private String depTime;
	private String arrAirport;
	private LocalDate arrDate;
	private String arrTime;
	private String flightName;
	
	public FlightDetailsDto() {
		super();
	}

	
	public FlightDetailsDto(int itineraryId, int flightId, String depAirport, LocalDate depDate, String depTime,
			String arrAirport, LocalDate arrDate, String arrTime, String flightName) {
		super();
		this.itineraryId = itineraryId;
		this.flightId = flightId;
		this.depAirport = depAirport;
		this.depDate = depDate;
		this.depTime = depTime;
		this.arrAirport = arrAirport;
		this.arrDate = arrDate;
		this.arrTime = arrTime;
		this.flightName = flightName;
	}



	public int getItineraryId() {
		return itineraryId;
	}
	public void setItineraryId(int itineraryId) {
		this.itineraryId = itineraryId;
	}
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
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
	public String getFlightName() {
		return flightName;
	}
	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}
	@Override
	public String toString() {
		return "FlightDetailsDto [itineraryId=" + itineraryId + ", flightId=" + flightId + ", DepAirport=" + depAirport
				+ ", DepDate=" + depDate + ", DepTime=" + depTime + ", ArrAirport=" + arrAirport + ", ArrDate="
				+ arrDate + ", ArrTime=" + arrTime + ", flightName=" + flightName + "]";
	}
	
	
	
}
