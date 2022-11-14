package com.api.lifetravel.accommodations.domain.model.entity;
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
@Table(name = "accommodations")
public class Accommodation {

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
    private String price;

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;

//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @JsonIdentityReference(alwaysAsId = true)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(mappedBy = "accommodation", cascade = CascadeType.ALL)
//    private List<AccommodationServiceEntity> accommodationServices;
//
//    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
//    @JsonIdentityReference(alwaysAsId = true)
//    @LazyCollection(LazyCollectionOption.FALSE)
//    @OneToMany(mappedBy = "accommodation", cascade = CascadeType.ALL)
//    private List<AccommodationCondition> accommodationConditions;

    @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
    @JsonIdentityReference(alwaysAsId = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @OneToMany(mappedBy = "accommodation", cascade = CascadeType.ALL)
    private List<AccommodationImage> accommodationImages;

}
