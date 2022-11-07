package com.api.lifetravel.trip_plan.mapping;

import com.api.lifetravel.shared.mapping.EnhancedModelMapper;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import javax.persistence.Access;
import java.io.Serializable;

@Component
@AllArgsConstructor
public class PackageMapper implements Serializable {
    private static final long serialVersionUID = 1L;

    @Autowired
    private EnhancedModelMapper modelMapper;
    public PackageMapper packageMapper(){return new PackageMapper(modelMapper);}


}
