package com.exalt.training.SoapApiApp.repositories;

import com.exalt.training.SoapApiApp.models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByClientId(Long clientId);
    List<Reservation> findByCarId(Long carId);
    void deleteByClientId(Long clientId);
    void deleteByCarId(Long carId);
}
