package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.DTO.ReservationRequest;
import com.exalt.training.restMaven.Models.Car;
import com.exalt.training.restMaven.Models.Client;
import com.exalt.training.restMaven.Models.Reservation;
import com.exalt.training.restMaven.Models.User;
import com.exalt.training.restMaven.Repo.CarRepo;
import com.exalt.training.restMaven.Repo.ClientRepo;
import com.exalt.training.restMaven.Repo.ReservationRepo;
import com.exalt.training.restMaven.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    private ReservationRepo reservationRepo;

    @Autowired
    private CarRepo carRepo;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ClientRepo clientRepo;

    public ReservationService (ReservationRepo reservationRepo, CarRepo carRepo, UserRepo userRepo, ClientRepo clientRepo) {
        this.reservationRepo = reservationRepo;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepo.findAll();
    }

    /* make a reservation for a car by a client with a specific start and end date.
    * the reservation details are contained in the ReservationRequest object */
    public Reservation createReservation(ReservationRequest request) {
        Car car = carRepo.findById(request.getCarId()).orElseThrow(() -> new RuntimeException("Car not found"));
        Client client = clientRepo.findById(request.getClientId()).orElseThrow(() -> new RuntimeException("Client not found"));

        Reservation reservation = new Reservation(car, client, request.getStartDate(), request.getEndDate());
        return reservationRepo.save(reservation);
    }

    // delete a reservation by its id.
    public void deleteReservation(Long reservationId) {
        reservationRepo.deleteById(reservationId);
    }

    // get all reservations of a client using client's id.
    public List<Reservation> getReservationsByClientId(Long clientId) {
        return reservationRepo.findByClientId(clientId);
    }

    // delete all reservations of a client using client's id.
    public void deleteReservationsByClientId(Long clientId) {
        reservationRepo.deleteByClientId(clientId);
    }

    // get all reservations of a car using car's id.
    public List<Reservation> getReservationsByCarId(Long carId) {
        return reservationRepo.findByCarId(carId);
    }

    // delete all reservations of a car using car's id.
    public void deleteReservationsByCarId(Long carId) {
        reservationRepo.deleteByCarId(carId);
    }

    // modify a reservation period by its id.
    public Reservation updateReservationPeriod(Long reservationId, ReservationRequest request) {

        if (reservationRepo.findById(reservationId).isEmpty()) {
            throw new RuntimeException("Reservation not found");
        }

        Reservation reservation = reservationRepo.findById(reservationId).get();

        reservation.setStartDate(request.getStartDate());
        reservation.setEndDate(request.getEndDate());

        // update cost of reservation if the period of reservation is changed.
        reservation.setReservationCost(reservation.getReservationCost());

        return reservation;
    }
}