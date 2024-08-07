package com.exalt.training.restMaven.DTO;

import java.time.LocalDate;

public class ReservationRequest {
    private Long userId;
    private Long carId;
    private Long clientId;
    private LocalDate startDate;
    private LocalDate endDate;

    // Getters and Setters
    public Long getClientId() {
        return userId;
    }

    public void setClientId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}