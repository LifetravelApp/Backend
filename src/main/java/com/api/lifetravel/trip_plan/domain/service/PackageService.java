package com.api.lifetravel.trip_plan.domain.service;

import com.api.lifetravel.trip_plan.domain.model.entity.Package;
import com.api.lifetravel.users.domain.model.entity.Agency;

import java.util.List;

public interface PackageService {

    List<Package> getAll();
    Package create(Package pocket); /*package = pocket*/
}
