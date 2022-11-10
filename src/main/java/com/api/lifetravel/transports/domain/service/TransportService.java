package com.api.lifetravel.transports.domain.service;


import com.api.lifetravel.transports.domain.model.entity.Transport;

import java.util.List;

public interface TransportService {
    List<Transport> getAll();
    Transport create(Transport review);

    Transport update(Long id,Transport review);

    Transport delete(Long id);
}
