package com.gymapp.gym_project.repository;

import com.gymapp.gym_project.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPaymentRepository extends JpaRepository<Payment, Long> {
}