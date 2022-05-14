package com.ashwin.demo.service;

import java.util.List;
import java.util.Optional;

import com.ashwin.demo.dto.FlightDetailsDto;
import com.ashwin.demo.entity.Flight;


public interface IFlightService {
	
	  //List
	  public List<Flight> getFlight();
	      
	  //Insert
	  public void saveFlight(Flight flight);
	      
	  //update by id
	  public Optional <Flight> getFlight(int id);
	      
	  //Delete
	  public void deleteFlight(int id);
	  
	  public List<FlightDetailsDto> getdetails();

}
