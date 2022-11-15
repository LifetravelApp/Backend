package com.api.lifetravel.payment.domain.model.entity;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "payments")

public class Payment {
    //add comment
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "plans_id")
    private Plan plan;;

    @NotNull
    @NotBlank
    private String price;

    @ManyToOne
    @JoinColumn(name = "traveler_id")
    private Traveler traveler;




}


