package com.api.lifetravel.payments.resource;


import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import lombok.*;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreatePaymentResource {

    @OneToOne
    @JoinColumn(name="package_id")
    private Plan plan;

     /*@ManyToOne
        @JoinColumn (name= "traveler_id")
        private Traveler traveler;*/


}
