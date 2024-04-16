package com.airline.booking.flightService.modules.dto;

import lombok.Data;

@Data
public class PurchaseDTO {
   private String userId; 
   private String flightNumber;
   private String passengerName;
   private int numberOfTickets;

   public String getUserId() {
      return this.userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }
}
