package com.api.lifetravel.users.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class AgencyResource {
    private Long id;
    private String name;
    private String email;
    private String ruc;
}