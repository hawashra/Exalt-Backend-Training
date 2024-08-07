package com.exalt.training.restMaven.Repo;

import com.exalt.training.restMaven.Models.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
    List<Reservation> findByClientId(Long clientId);
    List<Reservation> findByCarId(Long carId);
    void deleteByClientId(Long clientId);

}