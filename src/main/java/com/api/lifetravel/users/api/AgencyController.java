package com.api.lifetravel.users.api;

import com.api.lifetravel.users.domain.model.entity.Agency;
import com.api.lifetravel.users.mapping.AgencyMapper;
import com.api.lifetravel.users.resource.AgencyResource;
import com.api.lifetravel.users.resource.CreateAgencyResource;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;

import com.api.lifetravel.users.domain.service.AgencyService;

import org.springframework.data.domain.Pageable;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/agencies", produces = "application/json")
@AllArgsConstructor
public class AgencyController {

    private final AgencyService agencyService;

    private final AgencyMapper agencyMapper;

    @GetMapping
    @Operation(summary = "Get all agencies")
    public Page<AgencyResource> getAllAgencies(@ParameterObject Pageable pageable) {
        return agencyMapper.modelListPage(agencyService.getAll(), pageable);
    }

    @PostMapping
    public ResponseEntity<AgencyResource> createAgency(@RequestBody CreateAgencyResource resource) {
        Agency agencyInput = agencyMapper.toModel(resource);
        Agency agencySaved = agencyService.create(agencyInput);
        AgencyResource agencyResource = agencyMapper.toResource(agencySaved);
        return new ResponseEntity<>(agencyResource, HttpStatus.CREATED); // 201
    }

    @PutMapping("/{id}")
    public ResponseEntity<AgencyResource> updateAgency(@PathVariable Long id, @RequestBody CreateAgencyResource resource) {
        Agency agencyInput = agencyMapper.toModel(resource);
        Agency agencyUpdated = agencyService.update(id, agencyInput);
        AgencyResource agencyResource = agencyMapper.toResource(agencyUpdated);
        return new ResponseEntity<>(agencyResource, HttpStatus.OK); // 200
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AgencyResource> deleteAgency(@PathVariable Long id) {
        Agency agency = agencyService.delete(id);
        AgencyResource agencyResource = agencyMapper.toResource(agency);
        return new ResponseEntity<>(agencyResource, HttpStatus.OK); // 200
    }

}
