package com.proj.elevator.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.elevator.model.Destination;
import com.proj.elevator.repository.DestinationRepository;

@Service
public class DestinationService {
	

	@Autowired
	DestinationRepository destinationRepository;
	
	public void save(Destination destination) {
		destinationRepository.save(destination);
	}


	public List<Destination> getAllDestination() {
		List<Destination> destinations = new ArrayList<Destination>();
		destinationRepository.findAll().forEach(destination -> destinations.add(destination));
		return destinations;
	}
	
	
	public List<Destination> getAllElevatorById(Integer elevator) {
		List<Destination> destinations = new ArrayList<Destination>();
		destinationRepository.findByHotelId(elevator).forEach(destination -> destinations.add(destination));
		return destinations;
	}

	
	public List<Destination> getAllHotelById(Integer hotelId) {
		List<Destination> destinations = new ArrayList<Destination>();
		destinationRepository.findByHotelId(hotelId).forEach(destination -> destinations.add(destination));
		return destinations;
	}

	

}