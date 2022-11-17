package com.api.lifetravel.tours.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class TourResource {
    private Long id;
    private Long agencyId;
    private String details;
    private String location;
    private String meetingPoint;
    private String price;

}
