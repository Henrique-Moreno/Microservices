package com.airline.booking.flightService.modules.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "purchase")
public class PurchaseEntity {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private UUID id;

   private String bookingCode;
   private String flightNumber;
   private String passengerName;
   private int numberOfTickets;
}
