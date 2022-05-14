package com.ashwin.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ashwin.demo.entity.Itinerary;

@Repository
public interface IItineraryRepository extends CrudRepository<Itinerary, Integer> {

}
