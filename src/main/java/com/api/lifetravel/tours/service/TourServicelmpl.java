package com.api.lifetravel.tours.service;

import com.api.lifetravel.accommodations.domain.model.entity.Accommodation;
import com.api.lifetravel.accommodations.domain.persistence.AccommodationRepository;
import com.api.lifetravel.accommodations.domain.service.AccommodationService;
import com.api.lifetravel.shared.exception.ResourceValidationException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class TourServicelmpl implements AccommodationService {

    private static final String ENTITY = "Transport";
    private final AccommodationRepository tourRepository;
    private final Validator validator;

    // create the getAll method for the Transport
    @Override
    public List<Accommodation> getAll() {
        return tourRepository.findAll();
    }

    // create the create method for the Transport
    @Override
    public Accommodation create(Accommodation tour) {
        Set<ConstraintViolation<Accommodation>> violations = validator.validate(tour);

        if (!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }

        return tourRepository.save(tour);
    }

    // create the update method for the Transport
    @Override
    public Accommodation update(Long id, Accommodation tour) {
        Set<ConstraintViolation<Accommodation>> violations = validator.validate(tour);

        if (!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }

        Accommodation tour1 = tourRepository.findById(id).orElseThrow(() -> new ResourceValidationException(ENTITY, "id", id));

        tour1.setDetails(tour.getDetails());
        tour1.setPrice(tour.getPrice());
        tour1.setLocation(tour.getLocation());

        return tourRepository.save(tour1);
    }

    // create the delete method for the Transport
    @Override
    public Accommodation delete(Long id) {
        Accommodation tour = tourRepository.findById(id).orElseThrow(() -> new ResourceValidationException(ENTITY, "id", id));
        tourRepository.delete(tour);
        return tour;
    }
}
