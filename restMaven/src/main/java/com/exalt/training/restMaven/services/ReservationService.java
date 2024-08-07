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

    public Reservation createReservation(ReservationRequest request) {
        Car car = carRepo.findById(request.getCarId()).orElseThrow(() -> new RuntimeException("Car not found"));
        Client client = clientRepo.findById(request.getClientId()).orElseThrow(() -> new RuntimeException("Client not found"));

        Reservation reservation = new Reservation(car, client, request.getStartDate(), request.getEndDate());
        return reservationRepo.save(reservation);
    }

    public void deleteReservation(Long reservationId) {
        reservationRepo.deleteById(reservationId);
    }

    public List<Reservation> getReservationsByClientId(Long clientId) {
        return reservationRepo.findByClientId(clientId);
    }

    public List<Reservation> getReservationsByCarId(Long carId) {
        return reservationRepo.findByCarId(carId);
    }

    public void deleteReservationsByClientId(Long clientId) {
        reservationRepo.deleteByClientId(clientId);
    }
}