package com.exalt.training.restMaven.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


// data transfer object.
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationRequest {
    private Long userId;
    private Long carId;
    private Long clientId;
    private LocalDate startDate;
    private LocalDate endDate;

}