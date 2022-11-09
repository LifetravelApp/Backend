package com.api.lifetravel.payments.domain.persistence;

import com.api.lifetravel.payments.domain.model.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
