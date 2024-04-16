package com.airline.booking.airports.modules.airportManagement.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.airline.booking.airports.modules.airportManagement.entities.AirportEntity;

public interface AirportRepository extends JpaRepository<AirportEntity, UUID> {
  
   @Query("SELECT a FROM AirportEntity a WHERE a.city = :city")
   List<AirportEntity> findByCity(@Param("city") String city);

   @Query("SELECT a FROM AirportEntity a JOIN a.destinations d WHERE d.originAirport.code = :originAirportCode")
   List<AirportEntity> findDestinationsByOriginAirportCode(@Param("originAirportCode") String originAirportCode);

   List<AirportEntity> findByCityOrderByCodeAsc(String city);

   List<AirportEntity> findByCity(String city, Pageable pageable);
}
