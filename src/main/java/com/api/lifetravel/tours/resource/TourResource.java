package com.api.lifetravel.tours.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TourResource {
    private Long id;
    private String details;
    private String location;
    private String price;
//    private List<Services> services;
//    private List<Conditions> conditions;
//    private List<AccommodationImages> accommodationImages;

}
