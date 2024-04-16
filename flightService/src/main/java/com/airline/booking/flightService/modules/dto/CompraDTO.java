package com.airline.booking.flightService.modules.dto;

import lombok.Data;

@Data
public class CompraDTO {
   private String userId;
   private int numberOfTickets;

   public CompraDTO(String userId, int numberOfTickets) {
      this.userId = userId;
      this.numberOfTickets = numberOfTickets;
   }
}
