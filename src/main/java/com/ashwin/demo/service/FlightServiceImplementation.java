package com.ashwin.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.demo.dao.IFlightRepository;
import com.ashwin.demo.dto.FlightDetailsDto;
import com.ashwin.demo.entity.Flight;

@Service
public class FlightServiceImplementation implements IFlightService {

	 @Autowired
	 private IFlightRepository flightRepo;
	 
	 //Get all flights
	@Override
	public List<Flight> getFlight() {
		return (List<Flight>) flightRepo.findAll();
	}

	 //Insert/update
	@Override
	public void saveFlight(Flight flight) {
		   flightRepo.save(flight);
	}

	 //get by id
	@Override
	public Optional<Flight> getFlight(int id) {
		   return flightRepo.findById(id);
	}

	 //delete
	@Override
	public void deleteFlight(int id) {
		   flightRepo.deleteById(id);
	}

	@Override
	public List<FlightDetailsDto> getdetails() {
		return flightRepo.listAll();
	}

}
