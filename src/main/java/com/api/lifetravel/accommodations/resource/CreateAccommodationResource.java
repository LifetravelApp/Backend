package com.api.lifetravel.accommodations.resource;

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
public class CreateAccommodationResource {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Create a new attribute for the returnDate
    @NotNull
    @NotBlank
    private String details;

    // Create a new attribute for the returnDate
    @NotNull
    @NotBlank
    private String location;

    // Create a new attribute for the price
    @NotNull
    @NotBlank
    private String price;

}
