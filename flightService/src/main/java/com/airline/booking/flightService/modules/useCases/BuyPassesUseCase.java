package com.airline.booking.flightService.modules.useCases;

import java.util.UUID;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

import com.airline.booking.flightService.exceptions.AuthenticationException;
import com.airline.booking.flightService.modules.dto.PurchaseDTO;
import com.airline.booking.flightService.modules.entities.PurchaseEntity;
import com.airline.booking.flightService.modules.repositories.PurchaseRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BuyPassesUseCase {

   private final PurchaseRepository purchaseRepository;

   private final RabbitTemplate rabbitTemplate;
   
   private final RestTemplate restTemplate;

   public void authenticateUser(String username, String password) {
      String url = "http://localhost:8080/user/auth";
      ResponseEntity<String> response = restTemplate.postForEntity(url, new Object(), String.class);
      if (!response.getStatusCode().is2xxSuccessful()) {
         throw new AuthenticationException(url);
     }
   }

   public String buyPasses(PurchaseDTO purchaseDTO) {
      PurchaseEntity purchaseEntity = convertToEntity(purchaseDTO);
      PurchaseEntity savedPurchase = purchaseRepository.save(purchaseEntity);
      String mensagem = "Compra efetuada para o usuário " + purchaseDTO.getUserId() + ": "
            + purchaseDTO.getNumberOfTickets() + " passagens compradas.";
      rabbitTemplate.convertAndSend("compras", mensagem);
      return savedPurchase.getBookingCode();
   }

   private PurchaseEntity convertToEntity(PurchaseDTO purchaseDTO) {
      PurchaseEntity purchaseEntity = new PurchaseEntity();
      purchaseEntity.setBookingCode(UUID.randomUUID().toString());
      purchaseEntity.setFlightNumber(purchaseDTO.getFlightNumber());
      purchaseEntity.setPassengerName(purchaseDTO.getPassengerName());
      purchaseEntity.setNumberOfTickets(purchaseDTO.getNumberOfTickets());
      return purchaseEntity;
   }
}
