package com.api.lifetravel.transports.resource;

import com.api.lifetravel.transports.domain.model.entity.TransportImage;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;

import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TransportResource {

    // return the fields of the Transport entity
    private Long id;
    private String type;
    private String seats;
    private String departureDate;
    private String returnDate;
    private String price;
    private Traveler traveler;
    private Plan plan;
    private List<TransportImage> transportImages;

}
