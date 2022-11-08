package com.api.lifetravel.review.domain.service;

import com.api.lifetravel.review.domain.model.entity.Review;


import java.util.List;

public interface ReviewService {
    List<Review> getAll();
    Review create(Review review);
}
