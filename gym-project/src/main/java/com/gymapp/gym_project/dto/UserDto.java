package com.gymapp.gym_project.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserDto {

    private Long id;
    private String name;
    private String surName;
    private String email;
    private String number;
    private String gender;
    private String adress;
    private Timestamp birthdayDate;
    private String password;
    private int roleId;
    private int fitnessCenterId;
    private Timestamp createdAt;

}
