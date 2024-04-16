package com.airline.booking.airports.modules.airportManagement.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "airport")
@Data
public class AirportEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id;

   private String code;
   private String name;
   private String city;
}
