package com.api.lifetravel.trip_plan.api;

import com.api.lifetravel.trip_plan.domain.service.PackageService;
import com.api.lifetravel.trip_plan.mapping.PackageMapper;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/agencies", produces = "application/json")
@AllArgsConstructor
public class PackageController {
    private final PackageService packageService;
    private final PackageMapper packageMapper;



    }
}
