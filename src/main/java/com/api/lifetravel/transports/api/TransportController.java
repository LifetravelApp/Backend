package com.api.lifetravel.transports.api;

import com.api.lifetravel.transports.domain.model.entity.Transport;
import com.api.lifetravel.transports.domain.service.TransportService;
import com.api.lifetravel.transports.mapping.TransportMapper;
import com.api.lifetravel.transports.resource.CreateTransportResource;
import com.api.lifetravel.transports.resource.TransportResource;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/transports", produces = "application/json")
@AllArgsConstructor
public class TransportController {

    private final TransportService transportService;

    private final TransportMapper transportMapper;

    // Create a GET method to get all the transports
//    @GetMapping
//    public Page<TransportResource> getAll(@ParameterObject Pageable pageable) {
//        return transportMapper.modelListPage(transportService.getAll(), pageable);
//    }

    // Create the POST method to create a new transport
    @PostMapping
    public ResponseEntity<TransportResource> create(@RequestBody CreateTransportResource resource) {
        Transport transportInput = transportMapper.toModel(resource);
        Transport transportSaved = transportService.create(transportInput);
        TransportResource transportResource = transportMapper.toResource(transportSaved);
        return new ResponseEntity<>(transportResource, HttpStatus.CREATED); // 201
    }

    // Create the PUT method to update a transport
    @PutMapping("/{id}")
    public ResponseEntity<TransportResource> update(@PathVariable Long id, @RequestBody CreateTransportResource resource) {
        Transport transportInput = transportMapper.toModel(resource);
        Transport transportUpdated = transportService.update(id, transportInput);
        TransportResource transportResource = transportMapper.toResource(transportUpdated);

        return new ResponseEntity<>(transportResource, HttpStatus.OK); // 200
    }

    // Create the DELETE method to delete a transport
    @DeleteMapping("/{id}")
    public ResponseEntity<TransportResource> delete(@PathVariable Long id) {
        Transport transport = transportService.delete(id);
        TransportResource transportResource = transportMapper.toResource(transport);

        return new ResponseEntity<>(transportResource, HttpStatus.OK); // 200
    }


}
