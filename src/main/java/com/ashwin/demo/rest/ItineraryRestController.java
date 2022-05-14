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

import com.ashwin.demo.entity.Itinerary;
import com.ashwin.demo.service.IItineraryService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ItineraryRestController {
	
	  @Autowired
	  private IItineraryService itineraryService;
	  
	  //Get all Itinerarys
	  @GetMapping("/itineraries")
	  public List<Itinerary> getAllItinerary() {
	    return itineraryService.getItinerary();
	    
	  }
	  
	  //Get itinerary by id
	  @GetMapping("/itineraries/{id}")
	  public Optional <Itinerary> getItinerary(@PathVariable int id) {
	    return itineraryService.getItinerary(id);
	  }
	  
	  //Add itinerary
	  @PostMapping("/itineraries")
	  public void addItinerary(@RequestBody Itinerary itinerary) {
	    itineraryService.saveItinerary(itinerary);

	  }
	  
	  //update itinerary
	  @PutMapping("/itineraries")
	  public void updateItinerary(@RequestBody Itinerary itinerary) {
	    itineraryService.saveItinerary(itinerary);

	  }
	  
	  //Delete itinerary
	  @DeleteMapping("/itineraries/{id}")
	  public void deleteItinerary(@PathVariable int id) {
	    itineraryService.deleteItinerary(id);
	  }
	   

}
