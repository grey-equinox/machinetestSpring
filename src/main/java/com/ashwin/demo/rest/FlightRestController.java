package com.ashwin.demo.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwin.demo.dto.FlightDetailsDto;
import com.ashwin.demo.entity.Flight;
import com.ashwin.demo.service.IFlightService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class FlightRestController {
	

	  @Autowired
	  private IFlightService flightService;
	  
	  //Get all Flights
	  @GetMapping("/flights")
	  public List<Flight> getAllFlight() {
	    return flightService.getFlight();
	    
	  }
	  
	  //Get flight by id
	  @GetMapping("/flights/{id}")
	  public Optional <Flight> getFlight(@PathVariable int id) {
	    return flightService.getFlight(id);
	  }
	  
	  //Add flight
	  @PostMapping("/flights")
	  public void addFlight(@RequestBody Flight flight) {
	    flightService.saveFlight(flight);

	  }
	  
	  //update flight
	  @PutMapping("/flights")
	  public void updateFlight(@RequestBody Flight flight) {
	    flightService.saveFlight(flight);

	  }
	  
	  //Delete flight
	  @DeleteMapping("/flights/{id}")
	  public void deleteFlight(@PathVariable int id) {
	    flightService.deleteFlight(id);
	  }
	  
		//list all flightdetails
		@GetMapping("/flightdetails")
		public List<FlightDetailsDto> getAlldetails(){
			return flightService.getdetails();
	}
	    


}
