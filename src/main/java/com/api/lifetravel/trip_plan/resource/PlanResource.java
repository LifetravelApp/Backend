package com.api.lifetravel.trip_plan.resource;

import com.api.lifetravel.accommodations.resource.AccommodationResource;
import com.api.lifetravel.transports.resource.TransportResource;
import com.api.lifetravel.transports.resource.TransportResourceId;
import com.api.lifetravel.users.domain.model.entity.Agency;
import com.api.lifetravel.users.resource.AgencyResource;
import com.api.lifetravel.users.resource.AgencyResourceId;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PlanResource {
    private Long id;
    private AgencyResource agency;
    private TransportResource transport;
    private AccommodationResource accommodation;
//    private Tour tour;
    private String name;
    private String description;
    private String duration;
    private String typeOfPackage;
    private String typeOfTour;
    private String capacity;
    private String disponibility;
    private String thumbnail;
}
