package com.api.lifetravel.tours.resource;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTourResource {
    // Create a new attribute for the type of transport (bus, plane, train, etc) and use an ENUM
    @NotNull
    @NotBlank
    private String details;

    // Create a new attribute for the number of seats
    @NotNull
    @NotBlank
    private String location;

    // Create a new atrribute for the departureDate
    @NotNull
    @NotBlank
    private String price;

}
