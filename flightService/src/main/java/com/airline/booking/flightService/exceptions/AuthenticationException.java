package com.airline.booking.flightService.exceptions;

public class AuthenticationException extends RuntimeException {
   public AuthenticationException(String messagen) {
      super("Usuário autenticado com sucesso!");
   }
}
