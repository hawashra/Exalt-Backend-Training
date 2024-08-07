// File: src/main/java/com/exalt/training/restMaven/Controller/ReservationController.java
package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.DTO.ReservationRequest;
import com.exalt.training.restMaven.Models.Reservation;
import com.exalt.training.restMaven.services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@RequestMapping("/reservations")
public class ReservationController {

    @Autowired
    private ReservationService reservationService;

    @PostMapping("/reservations")
    public Reservation createReservation(@RequestBody ReservationRequest request) {
        return reservationService.createReservation(request);
    }

    @GetMapping("/reservations")
    public List<Reservation> getAllReservations() {
        return reservationService.getAllReservations();
    }

    @GetMapping("/reservations/client/{clientId}")
    public List<Reservation> getReservationsByClientId(@PathVariable Long clientId) {
        return reservationService.getReservationsByClientId(clientId);
    }

    @DeleteMapping("/reservations/{id}")
    public void deleteReservation(@PathVariable Long id) {
        reservationService.deleteReservation(id);
    }

    @DeleteMapping("/reservations/client/{clientId}")
    public void deleteClientReservations(@PathVariable Long clientId) {
        reservationService.deleteReservationsByClientId(clientId);

    }
}