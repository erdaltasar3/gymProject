package com.gymapp.gym_project.dto;

import lombok.Data;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class MembershipDto {
    private Long id;
    private int userId;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Long paymentId;
    private Long offerId;
    private boolean activeMember;
    private int remainingDay;
    private LocalDateTime createdAt;
}