package com.api.lifetravel.tours.api;

import com.api.lifetravel.tours.domain.model.entity.Tour;
import com.api.lifetravel.tours.domain.service.TourService;
import com.api.lifetravel.tours.mapping.TourMapper;
import com.api.lifetravel.tours.resource.CreateTourResource;
import com.api.lifetravel.tours.resource.TourResource;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/tours", produces = "application/json")
@AllArgsConstructor
public class TourController {

    private final TourService tourService;

    private final TourMapper tourMapper;

    // Create a GET method to get all the tours
//    @GetMapping
//    public Page<TourResource> getAll(@ParameterObject Pageable pageable) {
//        return tourMapper.modelListPage(tourService.getAll(), pageable);
//    }

    // Create the POST method to create a new tour
    @PostMapping
    public ResponseEntity<TourResource> create(@RequestBody CreateTourResource resource) {
        Tour tourInput = tourMapper.toModel(resource);
        Tour tourSaved = tourService.create(tourInput);
        TourResource tourResource = tourMapper.toResource(tourSaved);
        return new ResponseEntity<>(tourResource, HttpStatus.CREATED); // 201
    }

    // Create the PUT method to update a tour
    @PutMapping("/{id}")
    public ResponseEntity<TourResource> update(@PathVariable Long id, @RequestBody CreateTourResource resource) {
        Tour tourInput = tourMapper.toModel(resource);
        Tour tourUpdated = tourService.update(id, tourInput);
        TourResource tourResource = tourMapper.toResource(tourUpdated);

        return new ResponseEntity<>(tourResource, HttpStatus.OK); // 200
    }

    // Create the DELETE method to delete a tour
    @DeleteMapping("/{id}")
    public ResponseEntity<TourResource> delete(@PathVariable Long id) {
        Tour tour = tourService.delete(id);
        TourResource tourResource = tourMapper.toResource(tour);

        return new ResponseEntity<>(tourResource, HttpStatus.OK); // 200
    }


}
