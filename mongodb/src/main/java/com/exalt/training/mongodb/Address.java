package com.exalt.training.mongodb;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Address {
    private String country;
    private String city;
    private String postCode;

}
