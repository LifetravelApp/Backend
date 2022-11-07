package com.api.lifetravel.users.service;

import com.api.lifetravel.shared.exception.ResourceValidationException;
import com.api.lifetravel.users.domain.model.entity.Agency;
import com.api.lifetravel.users.domain.persistence.AgencyRepository;
import com.api.lifetravel.users.domain.service.AgencyService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class AgencyServiceImpl implements AgencyService{

    private static final String ENTITY = "Agency";
    private final AgencyRepository agencyRepository;
    private final Validator validator;

    @Override
    public List<Agency> getAll() {
        return agencyRepository.findAll();
    }

    @Override
    public Agency create(Agency agency) {
        // Validating agency object
        Set<ConstraintViolation<Agency>> violations = validator.validate(agency);

        if (!violations.isEmpty()) {
            throw new ResourceValidationException(ENTITY, violations);
        }

        return agencyRepository.save(agency);
    }

}
