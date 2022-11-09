package com.api.lifetravel.review.domain.model.entity;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import lombok.*;
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

    @ManyToOne
    @JoinColumn (name = "package_id")
    private Plan plan;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private Date date;

    @ManyToOne
    @JoinColumn (name = "traveler_id")
    private Traveler traveler;
    
    @Column(unique = true)
    private Date date;

    @NotNull
    @Column
    @NotBlank
    private String rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;
}
