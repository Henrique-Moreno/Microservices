package com.airline.booking.authentication.exceptions;

public class UserFoundException extends RuntimeException {
   public UserFoundException() {
      super("Usuário já existe");
   }
}
