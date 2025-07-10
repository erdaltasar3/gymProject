package com.gymapp.gym_project.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="membership")
public class Membership {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int userId;
    private LocalDate startDate;
    private LocalDate finishDate;
    private Long paymentId;
    private Long offerId;
    private boolean activeMember;
    private int remainingDay;
    private LocalDateTime createdAt = LocalDateTime.now();

}
