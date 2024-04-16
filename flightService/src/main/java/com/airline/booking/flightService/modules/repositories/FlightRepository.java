package com.airline.booking.flightService.modules.repositories;

import java.util.UUID;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.booking.flightService.modules.entities.FlightEntity;

@Repository
public interface FlightRepository extends JpaRepository<FlightEntity, UUID> {

   List<FlightEntity> findByOrigin(String origin);

   List<FlightEntity> findByDestination(String destination);

   List<FlightEntity> findByOriginAndDestination(String origin, String destination);
}