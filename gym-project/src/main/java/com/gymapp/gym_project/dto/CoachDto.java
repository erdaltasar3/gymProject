package com.gymapp.gym_project.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class CoachDto {

    private Long id;
    private int user_id;
    private String explain;
    private String expert;
    private Timestamp created_at;

}
