package com.gymapp.gym_project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymapp.gym_project.entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

}
