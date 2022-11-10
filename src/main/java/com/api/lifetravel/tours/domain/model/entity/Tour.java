package com.api.lifetravel.tours.domain.model.entity;
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
@Table(name = "tours")
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    // Create a OneToOne relation with the Agency
//    @OneToOne
//    @JoinColumn(name = "agency_id")
//    private Agency agency;

    // Relationships
//    @OneToMany(mappedBy = "tour")
//    private List<Locations> locations;
//
//    @OneToMany(mappedBy = "tour")
//    private List<Outstandings> outstandings;
//
//    @OneToMany(mappedBy = "tour")
//    private List<TourImages> tourImages;


}
