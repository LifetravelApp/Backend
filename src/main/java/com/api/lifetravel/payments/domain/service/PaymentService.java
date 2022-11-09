package com.api.lifetravel.payments.domain.service;

import com.api.lifetravel.payments.domain.model.entity.Payment;

import java.util.List;

public interface PaymentService {


    List<Payment> getAll();

    Payment create(Payment payment);

    Payment delete (Long id);
}
