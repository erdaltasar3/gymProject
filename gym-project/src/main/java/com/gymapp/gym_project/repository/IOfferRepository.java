package com.gymapp.gym_project.repository;

import com.gymapp.gym_project.entity.Offer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOfferRepository extends JpaRepository<Offer, Long> {
}