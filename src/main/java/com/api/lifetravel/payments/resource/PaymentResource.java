package com.api.lifetravel.payments.resource;


import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class PaymentResource {
    private Long id;
    private Plan plan;

}
