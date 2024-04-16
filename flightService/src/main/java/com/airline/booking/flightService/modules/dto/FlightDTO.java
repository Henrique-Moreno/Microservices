package com.airline.booking.flightService.modules.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightDTO {

   private String flightNumber;

   private String origin;

   private String destination;

   private LocalDateTime departureTime;

   private LocalDateTime arrivalTime;

   private String airline;

}
