package com.gymapp.gym_project.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="app_user")
@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(name="surname")
    private String surname;

    private String email;
    private String number;
    private String gender;
    private String adress;

    @Column(name="birthday_date")
    private Timestamp birthdayDate;

    private String password;

    @Column(name="role_id")  
    private int roleId;

    @Column(name="fitness_center_id")
    private int fitnessCenterId;

    @Column(name="created_at")
    private Timestamp createdAt;

}
