package com.ashwin.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashwin.demo.dao.IItineraryRepository;
import com.ashwin.demo.entity.Itinerary;


@Service
public class ItineraryServiceImplementation implements IItineraryService {

	 @Autowired
	 private IItineraryRepository itineraryRepo;
	 
	 //Get all itinerarys
	@Override
	public List<Itinerary> getItinerary() {
		   return (List<Itinerary>) itineraryRepo.findAll();
	}

	//Insert/update
	@Override
	public void saveItinerary(Itinerary itinerary) {
		   itineraryRepo.save(itinerary);
	}

	 //get by id
	@Override
	public Optional<Itinerary> getItinerary(int id) {
		   return itineraryRepo.findById(id);
	}

	 //delete
	@Override
	public void deleteItinerary(int id) {
		   itineraryRepo.deleteById(id);
	}

}
