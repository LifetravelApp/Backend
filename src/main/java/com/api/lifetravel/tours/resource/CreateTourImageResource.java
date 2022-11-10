package com.api.lifetravel.tours.resource;

import com.api.lifetravel.tours.domain.model.entity.Tour;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTourImageResource {

    @NotNull
    @NotBlank
    private String path;

    @OneToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;

}
