package com.api.lifetravel.trip_plan.api;

import com.api.lifetravel.trip_plan.domain.model.entity.Plan;
import com.api.lifetravel.trip_plan.domain.service.PlanService;
import com.api.lifetravel.trip_plan.mapping.PlanMapper;
import com.api.lifetravel.trip_plan.resource.CreatePlanResource;
import com.api.lifetravel.trip_plan.resource.PlanResource;


import io.swagger.v3.oas.annotations.Operation;

import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/packages", produces = "application/json")
@AllArgsConstructor
public class PlanController {
    private final PlanService planService;
    private final PlanMapper planMapper;

    @GetMapping
    @Operation(summary = "Get all packages")
    public Page<PlanResource>getAllPlans(@ParameterObject Pageable pageable){
        return planMapper.modelListPage(planService.getAll(),pageable);
    }

    @PostMapping
    public ResponseEntity<PlanResource>createPlan(@RequestBody CreatePlanResource resource){
        Plan planInput = planMapper.toModel(resource);
        Plan planSaved = planService.create(planInput);
        PlanResource planResource = planMapper.toResource(planSaved);
        return new ResponseEntity<>(planResource , HttpStatus.CREATED);//201
    }

    @PutMapping("/{id}")
    public ResponseEntity<PlanResource> updatePlan(@PathVariable Long id, @RequestBody CreatePlanResource resource) {
        Plan planInput = planMapper.toModel(resource);
        Plan planSaved = planService.update(id, planInput);
        PlanResource planResource = planMapper.toResource(planSaved);
        return new ResponseEntity<>(planResource, HttpStatus.OK); // 200
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<PlanResource> deletePlan(@PathVariable Long id) {
        Plan plan = planService.delete(id);
        PlanResource planResource = planMapper.toResource(plan);
        return new ResponseEntity<>(planResource, HttpStatus.OK); // 200
    }



}

