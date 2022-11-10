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

    @Override
    public Plan update(Long id, Plan planInput) {
        // Validating agency object
        Set<ConstraintViolation<Plan>> violations = validator.validate(planInput);

        if (!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }

        Plan plan = planRepository.findById(id).orElseThrow(() -> new ResourceValidationException(ENTITY, "id", id));

        plan.setName(plan.getName());
        plan.setDescription(planInput.getDescription());
        plan.setDuration(planInput.getDuration());
        plan.setTypeOfPackage(planInput.getTypeOfPackage());
        plan.setTypeOfTour(planInput.getTypeOfTour());
        plan.setCapacity(planInput.getCapacity());
        plan.setDisponibility(plan.getDisponibility());
        plan.setAgency(plan.getAgency());

        return planRepository.save(plan);
    }

    @Override
    public Plan delete(Long id) {
        Plan plan = planRepository.findById(id).orElseThrow(() -> new ResourceValidationException(ENTITY, "id", id));
        planRepository.delete(plan);
        return plan;
    }
}
