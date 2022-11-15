package com.api.lifetravel.tours.resource;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTourResource {
    @NotNull
    @NotBlank
    private String details;

    @NotNull
    @NotBlank
    private String location;

    @NotNull
    @NotBlank
    private String meetingPoint;

    @NotNull
    @NotBlank
    private String  price;
}
