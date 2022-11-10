package com.api.lifetravel.tours.domain.service;

import com.api.lifetravel.tours.domain.model.entity.Tour;

import java.util.List;

public interface TourService {
    List<Tour> getAll();
    Tour create(Tour review);

    Tour update(Long id, Tour review);

    Tour delete(Long id);
}
