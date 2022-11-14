package com.api.lifetravel.transports.domain.model.entity;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Agency;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.*;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transports")
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @OneToOne(mappedBy = "transport")
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany( mappedBy = "transport", cascade = CascadeType.ALL)
    private List<TransportImage> transportImages;

}
