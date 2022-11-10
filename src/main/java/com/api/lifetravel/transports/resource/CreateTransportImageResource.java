package com.api.lifetravel.transports.resource;

import com.api.lifetravel.transports.domain.model.entity.Transport;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransportImageResource {
    // Create the field for the TransportImage
    @NotNull
    @NotBlank
    private String path;

    // Create a OneToOne relation with the Transport
    @OneToOne
    @JoinColumn(name = "transport_id")
    private Transport transport;

}
