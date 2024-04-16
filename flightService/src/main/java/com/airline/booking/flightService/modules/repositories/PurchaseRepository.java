package com.airline.booking.flightService.modules.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airline.booking.flightService.modules.entities.PurchaseEntity;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseEntity, UUID> {
}
