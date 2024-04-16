package com.airline.booking.airports.modules.airportManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airline.booking.airports.modules.airportManagement.dto.AirportDTO;
import com.airline.booking.airports.modules.airportManagement.useCases.AirportUseCase;

@RestController
@RequestMapping("/airports")
public class AirportController {
   @Autowired
   private AirportUseCase airportUseCase;

   @GetMapping
   public List<AirportDTO> getAllAirports() {
      return airportUseCase.getAllAirports();
   }

   @GetMapping("/destinations")
   public List<AirportDTO> getDestinationsFromOriginAirport(@RequestParam String originAirportCode) {
      return airportUseCase.getDestinationsFromOriginAirport(originAirportCode);
   }
}
