package com.gymapp.gym_project.mapper;

import com.gymapp.gym_project.entity.Payment;
import com.gymapp.gym_project.dto.PaymentDto;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {
    public PaymentDto toDto(Payment payment) {
        if (payment == null) return null;
        PaymentDto dto = new PaymentDto();
        dto.setId(payment.getId());
        dto.setIncome(payment.isIncome());
        dto.setPrice(payment.getPrice());
        dto.setFitnessCenterId(payment.getFitnessCenterId());
        dto.setCreatedAt(payment.getCreatedAt());
        return dto;
    }

    public Payment toEntity(PaymentDto dto) {
        if (dto == null) return null;
        Payment payment = new Payment();
        payment.setId(dto.getId());
        payment.setIncome(dto.isIncome());
        payment.setPrice(dto.getPrice());
        payment.setFitnessCenterId(dto.getFitnessCenterId());
        return payment;
    }
}