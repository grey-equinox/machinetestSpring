package com.ashwin.demo.service;

import java.util.List;
import java.util.Optional;

import com.ashwin.demo.entity.Itinerary;

public interface IItineraryService {

	  //List
	  public List<Itinerary> getItinerary();
	      
	  //Insert
	  public void saveItinerary(Itinerary itinerary);
	      
	  //update by id
	  public Optional <Itinerary> getItinerary(int id);
	      
	  //Delete
	  public void deleteItinerary(int id);
	  
}
