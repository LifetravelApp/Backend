package com.api.lifetravel.trip_plan.domain.model.entity;
import com.api.lifetravel.reviews.domain.model.entity.Review;
import com.api.lifetravel.transports.domain.model.entity.Transport;
import com.api.lifetravel.users.domain.model.entity.Agency;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "packages")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max= 60)
    @Column(unique = true)
    private String name;

    @NotNull
    @NotBlank
    @Size(max= 255)
    private String description;

    @NotNull
    @NotBlank
    @Size(max= 31, min=1)
    private String duration;

    @NotNull
    @NotBlank
    @Size(max=255)
    private String typeOfPackage ;

    @NotNull
    @NotBlank
    @Size(max=255)
    private String typeOfTour ;

    @NotNull
    @NotBlank
    @Size(max=15)
    private String capacity ;

    @NotNull
    @NotBlank
    private String disponibility;

    @NotNull
    @NotBlank
    private String thumbnail;

    @ManyToOne
    @JoinColumn (name = "agency_id")
    private Agency agency;

    @OneToOne
    @JoinColumn(name = "transport_id")
    private Transport transport;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "plan", cascade = CascadeType.ALL)
    private List<Review> reviews;
}
