package com.api.lifetravel.trip_plan.service;

import com.api.lifetravel.shared.exception.ResourceValidationException;
import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.trip_plan.domain.persistence.PlanRepository;
import com.api.lifetravel.trip_plan.domain.service.PlanService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class PlanServiceImpl implements PlanService {
    private static final String ENTITY = "Plan";
    private final PlanRepository planRepository;
    private final Validator validator;

    @Override
    public List<Plan> getAll(){ return planRepository.findAll();}

    @Override
    public Plan create(Plan plan) {
        // Validating agency object
        Set<ConstraintViolation<Plan>> violations =validator.validate(plan);

        if (!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }

        return planRepository.save(plan);
    }
}
