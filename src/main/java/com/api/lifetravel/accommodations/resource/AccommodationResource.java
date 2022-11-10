package com.api.lifetravel.accommodations.resource;

import com.api.lifetravel.accommodations.domain.model.entity.AccommodationCondition;
import com.api.lifetravel.accommodations.domain.model.entity.AccommodationServiceEntity;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Agency;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import com.api.lifetravel.users.resource.AgencyResourceId;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

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
    private AgencyResourceId agency;
//    private List<AccommodationServiceEntity> services;
//    private List<AccommodationCondition> conditions;
//    private List<AccommodationImages> accommodationImages;
}
