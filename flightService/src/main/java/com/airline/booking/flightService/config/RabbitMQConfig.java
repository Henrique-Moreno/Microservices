package com.airline.booking.flightService.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

   @Bean
   public Queue comprasQueue() {
      return new Queue("compras");
   }
}
