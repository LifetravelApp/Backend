package com.api.lifetravel.payments.api;

import com.api.lifetravel.payments.domain.model.entity.Payment;
import com.api.lifetravel.payments.domain.service.PaymentService;
import com.api.lifetravel.payments.mapping.PaymentMapper;
import com.api.lifetravel.payments.resource.CreatePaymentResource;
import com.api.lifetravel.payments.resource.PaymentResource;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import org.springdoc.api.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*", maxAge = 3600, allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.OPTIONS, RequestMethod.HEAD})
@RestController
@RequestMapping(value = "api/v1/payments", produces = "application/json")
@AllArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    private final PaymentMapper paymentMapper;


    @GetMapping
    @Operation(summary = "Get all payments")
    public Page<PaymentResource> getAllPayments(@ParameterObject Pageable pageable){
        return paymentMapper.modelListPage(paymentService.getAll(),pageable);

    }

    @PostMapping
    public ResponseEntity<PaymentResource> createPayment(@RequestBody CreatePaymentResource resource){
        Payment paymentInput= paymentMapper.toModel(resource);
        Payment paymentSaved = paymentService.create(paymentInput);
        PaymentResource paymentResource= paymentMapper.toResource(paymentSaved);
        return new ResponseEntity<>(paymentResource, HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<PaymentResource> deletePayment(@PathVariable Long id){
        Payment payment =paymentService.delete(id);
        PaymentResource paymentResource=paymentMapper.toResource(payment);
        return new ResponseEntity<>(paymentResource,HttpStatus.OK);

    }
}
