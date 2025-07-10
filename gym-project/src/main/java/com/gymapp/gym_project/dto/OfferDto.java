package com.gymapp.gym_project.dto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class OfferDto {
    private Long id;
    private String name;
    private String explanation;
    private LocalDate startDate;
    private LocalDate finishDate;
    private int price;
    private Long fitnessCenterId;
    private LocalDateTime createdDate;
}