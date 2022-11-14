package com.api.lifetravel.reviews.domain.model.entity;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.users.domain.model.entity.Traveler;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String date;
    
    @NotNull
    @Column
    @NotBlank
    private String rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "package_id", referencedColumnName="id", nullable = false)
    @JsonIgnore
    private Plan plan;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn (name = "traveler_id", referencedColumnName="id", nullable = false)
    @JsonIgnore
    private Traveler traveler;
}
