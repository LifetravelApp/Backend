package com.api.lifetravel.accommodations.resource;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AccommodationResource {
    private Long id;
    private String details;
    private String location;
    private String price;
//    private List<Services> services;
//    private List<Conditions> conditions;
//    private List<AccommodationImages> accommodationImages;
}
