package com.gymapp.gym_project.repository;

import com.gymapp.gym_project.entity.Membership;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IMembershipRepository extends JpaRepository<Membership, Long> {
}