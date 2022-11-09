package com.api.lifetravel.trip_plan.domain.service;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;

import java.util.List;

public interface PlanService {

    List<Plan> getAll();
    Plan create(Plan plan);
}
