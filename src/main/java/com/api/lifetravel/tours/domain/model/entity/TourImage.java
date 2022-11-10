package com.api.lifetravel.tours.domain.model.entity;
import lombok.*;

import javax.persistence.*;
import javax.xml.transform.Source;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tour_images")
public class TourImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String path;

    @ManyToOne
    @JoinColumn(name = "tour_id")
    private  Tour tour;

}
