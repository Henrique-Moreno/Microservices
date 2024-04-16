package com.airline.booking.flightService.modules.useCases;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.airline.booking.flightService.modules.dto.AirportDTO;
import com.airline.booking.flightService.modules.dto.FlightDTO;
import com.airline.booking.flightService.modules.entities.FlightEntity;
import com.airline.booking.flightService.modules.repositories.FlightRepository;

import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class FlightUseCase {
   private final FlightRepository flightRepository;
   private final RestTemplate restTemplate;

   private static final String AIRPORTS_URL = "http://localhost:8081/airports";

   public List<FlightDTO> getFlightsByOrigin(String origin) {
      List<FlightEntity> flights = flightRepository.findByOrigin(origin);
      return flights.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
   }

   public List<FlightDTO> getFlightsByDestination(String destination) {
      List<FlightEntity> flights = flightRepository.findByDestination(destination);
      return flights.stream()
            .map(this::convertToDTO)
            .collect(Collectors.toList());
   }

   public List<AirportDTO> getAllAirports() {
      ResponseEntity<List<AirportDTO>> response = restTemplate.exchange(
            AIRPORTS_URL,
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<AirportDTO>>() {});

      if (response.getStatusCode().is2xxSuccessful()) {
         return response.getBody();
      } else {
         throw new RuntimeException("Failed to fetch airports. Status code");
      }
   }

   private FlightDTO convertToDTO(FlightEntity flightEntity) {
      FlightDTO dto = new FlightDTO();
      dto.setFlightNumber(flightEntity.getFlightNumber());
      dto.setOrigin(flightEntity.getOrigin());
      dto.setDestination(flightEntity.getDestination());
      dto.setDepartureTime(flightEntity.getDepartureTime());
      dto.setArrivalTime(flightEntity.getArrivalTime());
      dto.setAirline(flightEntity.getAirline());
      return dto;
   }
}

