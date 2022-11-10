package com.api.lifetravel.reviews.resource;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateReviewResource {

    @NotNull
    @NotBlank
    private Plan plan;

    @NotNull
    @NotBlank
    private Traveler traveler;

    @NotNull
    @Column(unique = true)
    private String date;

    @NotNull
    @Column
    @NotBlank
    private String rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;


}
