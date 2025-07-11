package com.gymapp.gym_project.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class PaymentDto {
    private Long id;
    private boolean income;
    private int price;
    private int fitnessCenterId;
    private LocalDateTime createdAt;
}