package com.api.lifetravel.review.resource;

import lombok.*;

import javax.persistence.Column;
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
    @Column(unique = true)
    private Date date;

    @NotNull
    @Column
    @NotBlank
    private int ranking;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;

}
