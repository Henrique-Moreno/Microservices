package com.airline.booking.flightService.modules.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airline.booking.flightService.modules.dto.FlightDTO;
import com.airline.booking.flightService.modules.useCases.FlightUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class FlightController {

   private final FlightUseCase flightUseCase;

   @GetMapping("/flights/origin")
   public List<FlightDTO> getFlightsByOrigin(@RequestParam String origin) {
      return flightUseCase.getFlightsByOrigin(origin);
   }

   @GetMapping("/flights/destination")
   public List<FlightDTO> getFlightsByDestination(@RequestParam String destination) {
      return flightUseCase.getFlightsByDestination(destination);
   }
}
