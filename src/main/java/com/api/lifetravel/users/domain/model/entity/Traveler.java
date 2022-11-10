package com.api.lifetravel.users.domain.model.entity;
import com.api.lifetravel.reviews.domain.model.entity.Review;
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
@Table(name = "travelers")
public class Traveler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    @NotNull
    @NotBlank
    @Size(max= 60)
    private String name;

    @Column(unique = true)
    @NotBlank
    @Size(max= 60)
    private String email;

    @Column
    @NotBlank
    @Size(min = 9, max = 9)
    private String phone;

    @OneToMany(mappedBy= "traveler")
    private List<Review> reviews;

}
