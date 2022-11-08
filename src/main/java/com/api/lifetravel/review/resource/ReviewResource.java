package com.api.lifetravel.review.resource;
import lombok.*;

import java.sql.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor

public class ReviewResource {
    private Long id;
    //private Traveler traveler;
    //private Plan plan;
    private Date date;
    private int ranking;
    private String comment;
}
