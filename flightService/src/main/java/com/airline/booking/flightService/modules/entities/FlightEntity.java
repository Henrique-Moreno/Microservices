package com.airline.booking.flightService.modules.entities;

import lombok.Data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity(name = "flight")
public class FlightEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String flightNumber;

    private String origin;

    private String destination;

    private LocalDateTime departureTime;

    private LocalDateTime arrivalTime;

    private String airline;
}
