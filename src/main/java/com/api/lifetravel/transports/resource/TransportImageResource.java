package com.api.lifetravel.transports.resource;

import com.api.lifetravel.transports.domain.model.entity.TransportImage;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TransportImageResource {

    private Long id;
    private String path;
    private TransportResource transport;

}
