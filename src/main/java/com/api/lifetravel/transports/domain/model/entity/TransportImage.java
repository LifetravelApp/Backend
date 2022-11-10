package com.api.lifetravel.transports.domain.model.entity;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transport_images")
public class TransportImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Create a new attribute for the path
    @Column
    private String path;

    // Create a ManyToOne relationship with Transport
    @ManyToOne
    @JoinColumn(name = "transport_id")
    private Transport transport;

}
