package com.api.lifetravel.accommodations.api;

import com.api.lifetravel.accommodations.domain.model.entity.Accommodation;
import com.api.lifetravel.accommodations.domain.service.AccommodationService;
import com.api.lifetravel.accommodations.mapping.AccommodationMapper;
import com.api.lifetravel.accommodations.resource.CreateAccommodationResource;
import com.api.lifetravel.accommodations.resource.AccommodationResource;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/accommodations", produces = "application/json")
@AllArgsConstructor
public class AccommodationController {

    private final AccommodationService accommodationService;

    private final AccommodationMapper accommodationMapper;

    @GetMapping
    public Page<AccommodationResource> getAll(@ParameterObject Pageable pageable) {
        return accommodationMapper.modelListPage(accommodationService.getAll(), pageable);
    }

    // Create the POST method to create a new accommodation
    @PostMapping
    public ResponseEntity<AccommodationResource> create(@RequestBody CreateAccommodationResource resource) {
        Accommodation accommodationInput = accommodationMapper.toModel(resource);

        Accommodation accommodationSaved = accommodationService.create(accommodationInput);
        AccommodationResource accommodationResource = accommodationMapper.toResource(accommodationSaved);


        return new ResponseEntity<>(accommodationResource, HttpStatus.CREATED); // 201
    }

    // Create the PUT method to update a accommodation
    @PutMapping("/{id}")
    public ResponseEntity<AccommodationResource> update(@PathVariable Long id, @RequestBody CreateAccommodationResource resource) {
        Accommodation accommodationInput = accommodationMapper.toModel(resource);
        Accommodation accommodationUpdated = accommodationService.update(id, accommodationInput);
        AccommodationResource accommodationResource = accommodationMapper.toResource(accommodationUpdated);

        return new ResponseEntity<>(accommodationResource, HttpStatus.OK); // 200
    }

    // Create the DELETE method to delete a accommodation
    @DeleteMapping("/{id}")
    public ResponseEntity<AccommodationResource> delete(@PathVariable Long id) {
        Accommodation accommodation = accommodationService.delete(id);
        AccommodationResource accommodationResource = accommodationMapper.toResource(accommodation);

        return new ResponseEntity<>(accommodationResource, HttpStatus.OK); // 200
    }


}
