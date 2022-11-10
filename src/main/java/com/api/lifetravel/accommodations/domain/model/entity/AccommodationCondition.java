package com.api.lifetravel.accommodations.domain.model.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "conditions")
public class AccommodationCondition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Create a new attribute for the checkIn
    @NotNull
    @NotBlank
    private String checkIn;

    // Create a new attribute for the checkOut
    @NotNull
    @NotBlank
    private String checkOut;


    // relationship many to one with Accommodation
    // Create a ManyToOne relationship with Accommodation
    @ManyToOne
    @JoinColumn(name = "accommodation_id")
    private Accommodation accommodation;
}
