package com.api.lifetravel.payments.domain.model.entity;


import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import lombok.*;
import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name= "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
        @OneToOne
        @JoinColumn (name= "package_id")
        private Plan plan;
}
