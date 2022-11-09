package com.api.lifetravel.review.domain.model.entity;


import lombok.*;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

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
    private Date date;


    /*@ManyToOne
    @JoinColumn (name = "traveler_id")
    private Traveler traveler;

    @ManyToOne
    @JoinColumn (name = "package_id")
    private Plan plan;
    */

    @NotNull
    @Column
    @NotBlank
    private int rating;

    @Column
    @NotBlank
    @Size(max= 300)
    private String comment;
}
