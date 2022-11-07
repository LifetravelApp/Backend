package com.api.lifetravel.trip_plan.resource;

import com.api.lifetravel.users.domain.model.entity.Agency;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PlanResource {
    private Long id;
    private Agency agency;
    /*private Reviews reviews;*/
    private String name;
    private String description;
    private String duration;
    private String typeOfPackage;
    private String typeOfTour;
    private String capacity;
    private String disponibility;
    private String image;
}
