package com.api.lifetravel.transports.resource;

import com.api.lifetravel.users.domain.model.entity.Agency;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransportResource {
    @NotNull
    @NotBlank
    private String type;

    @NotNull
    @NotBlank
    private String seats;

    @NotNull
    @NotBlank
    private String departureDate;

    @NotNull
    @NotBlank
    private String returnDate;

    @NotNull
    @NotBlank
    private String price;

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

}
