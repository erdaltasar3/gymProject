package com.gymapp.gym_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymapp.gym_project.entity.Coach;

@Repository
public interface ICoachRepository extends JpaRepository<Coach, Long> {
    

}
