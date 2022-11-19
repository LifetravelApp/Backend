package com.api.lifetravel.tours.domain.model.entity;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
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
@Entity
@Table(name = "tours")
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
    private String price;

    @Column(columnDefinition = "varchar(255) default 'true'")
    private String available;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.MERGE)
    @JoinColumn(name = "agency_id")
    private Agency agency;

    @OneToOne(mappedBy = "tour", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
    private Plan plan;


}
