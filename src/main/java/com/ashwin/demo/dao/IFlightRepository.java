package com.ashwin.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.demo.dto.FlightDetailsDto;
import com.ashwin.demo.entity.Flight;

@Repository
public interface IFlightRepository extends CrudRepository<Flight, Integer> {
	
	@Query("SELECT new com.ashwin.demo.dto.FlightDetailsDto(i.itineraryId, i.flightId, i.depAirport, "
			+ "i.depDate, i.depTime, i.arrAirport, i.arrDate, i.arrTime, f.flightName)FROM Itinerary "
			+ "i INNER JOIN i.flight f ORDER BY i.flightId")
	public List<FlightDetailsDto> listAll();

}
