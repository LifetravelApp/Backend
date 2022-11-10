package com.api.lifetravel.reviews.api;

import com.api.lifetravel.reviews.domain.model.entity.Review;
import com.api.lifetravel.reviews.domain.service.ReviewService;
import com.api.lifetravel.reviews.mapping.ReviewMapper;

import com.api.lifetravel.reviews.resource.CreateReviewResource;
import com.api.lifetravel.reviews.resource.ReviewResource;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;


import org.springframework.data.domain.Pageable;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/review", produces = "application/json")
@AllArgsConstructor
public class ReviewController {

    private final ReviewService reviewService;

    private final ReviewMapper reviewMapper;

    @GetMapping
    @Operation(summary = "Get all reviews")
    public Page<ReviewResource> getAllReviews(@ParameterObject Pageable pageable) {
        return reviewMapper.modelListPage(reviewService.getAll(), pageable);
    }

    @PostMapping
    public ResponseEntity<ReviewResource> createReview(@RequestBody CreateReviewResource resource) {
        Review reviewInput = reviewMapper.toModel(resource);
        Review reviewSaved = reviewService.create(reviewInput);
        ReviewResource reviewResource = reviewMapper.toResource(reviewSaved);
        return new ResponseEntity<>(reviewResource, HttpStatus.CREATED); // 201
    }

}
