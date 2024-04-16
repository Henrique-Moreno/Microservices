package com.airline.booking.airports.modules.airportManagement.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airline.booking.airports.modules.airportManagement.dto.AirportDTO;
import com.airline.booking.airports.modules.airportManagement.entities.AirportEntity;
import com.airline.booking.airports.modules.airportManagement.repositories.AirportRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AirportUseCase {

   @Autowired
   private AirportRepository airportRepository;

   public List<AirportDTO> getAllAirports() {
      List<AirportEntity> airports = airportRepository.findAll();
      return airports.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
   }

   public List<AirportDTO> getDestinationsFromOriginAirport(String originAirportCode) {
      List<AirportEntity> destinations = airportRepository.findDestinationsByOriginAirportCode(originAirportCode);
      return destinations.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
   }

   private AirportDTO convertToDTO(AirportEntity airport) {
      AirportDTO dto = new AirportDTO();
      dto.setCode(airport.getCode());
      dto.setName(airport.getName());
      dto.setCity(airport.getCity());
      return dto;
   }
}
