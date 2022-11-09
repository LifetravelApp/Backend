package com.api.lifetravel.users.domain.model.entity;
//import com.api.lifetravel.shared.domain.model.AuditModel;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agencies")
public class Agency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @NotBlank
    @Size(max= 60)
    @Column(unique = true)
    private String name;

    @Column
    @NotBlank
    @Size(max= 60)
    private String email;

    @Column
    @NotBlank
    @Size(max= 11, min=11)
    private String ruc;

}
