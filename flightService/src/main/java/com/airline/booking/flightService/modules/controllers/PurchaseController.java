package com.airline.booking.flightService.modules.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airline.booking.flightService.modules.dto.PurchaseDTO;
import com.airline.booking.flightService.modules.useCases.BuyPassesUseCase;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/purchases")
@RequiredArgsConstructor
public class PurchaseController {

   private final BuyPassesUseCase buyPassesUseCase;

   @PostMapping
   public ResponseEntity<String> buyPasses(@RequestBody PurchaseDTO purchaseDTO) {
      String bookingCode = buyPassesUseCase.buyPasses(purchaseDTO);
      return ResponseEntity.status(HttpStatus.CREATED).body(bookingCode);
   }
}
