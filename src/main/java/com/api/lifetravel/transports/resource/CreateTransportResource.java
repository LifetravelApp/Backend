package com.api.lifetravel.transports.resource;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Agency;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransportResource {
    // Create a new attribute for the type of transport (bus, plane, train, etc) and use an ENUM
    @NotNull
    @NotBlank
    private String type;

    // Create a new attribute for the number of seats
    @NotNull
    @NotBlank
    private String seats;

    // Create a new atrribute for the departureDate
    @NotNull
    @NotBlank
    private String departureDate;

    // Create a new attribute for the returnDate
    @NotNull
    @NotBlank
    private String returnDate;

    // Create a new attribute for the price
    @NotNull
    @NotBlank
    private String price;

    // Create a OneToOne relation with the Agency
    @OneToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

    // Create a OneToOne relation with the Plan
    @OneToOne
    @JoinColumn(name = "plan_id")
    private Plan plan;

}
