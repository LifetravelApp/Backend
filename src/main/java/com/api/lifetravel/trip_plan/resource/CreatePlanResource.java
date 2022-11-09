package com.api.lifetravel.trip_plan.resource;

    import com.api.lifetravel.users.domain.model.entity.Agency;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class CreatePlanResource {

    @ManyToOne
    @JoinColumn(name = "agency_id")
    private Agency agency;
    /*
    @OneToMany
    @JoinColumn (name = "reviews_id")
    private ;
    */
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
    private String image;
}
