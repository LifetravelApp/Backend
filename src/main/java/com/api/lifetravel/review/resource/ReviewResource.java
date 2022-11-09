package com.api.lifetravel.review.resource;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;
import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class ReviewResource {
    private Long id;
    private Traveler traveler;
    private Plan plan;
    private Date date;
    private String rating;
    private String comment;
}
