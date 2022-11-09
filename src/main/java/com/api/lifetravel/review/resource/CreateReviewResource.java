package com.api.lifetravel.review.resource;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Agency;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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


    @ManyToOne
    @JoinColumn(name = "package_id")
    private Plan plan;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private Date date;

    @NotNull
    @Column
    @NotBlank
    private String rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;


}
