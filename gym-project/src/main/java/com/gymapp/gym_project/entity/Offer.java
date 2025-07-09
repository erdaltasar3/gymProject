package com.gymapp.gym_project.entity;

import jakarta.persistence.*;
import lombok.*;

import java.security.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="offer")
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String explanation;
    private LocalDate startDate ;
    private LocalDate finishDate ;
    private int price;
    private Long fitnessCenterId;

    @Column(name = "created_at")
    private LocalDateTime createdDate = LocalDateTime.now();
}
