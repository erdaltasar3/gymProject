package com.gymapp.gym_project.dto;

import java.sql.Time;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class FitnessCenterDto {

    private Long id;
    private String name;
    private String city;
    private String adress;
    private String number;
    private String capasity;
    private Time open_time;
    private Time close_time;

}
