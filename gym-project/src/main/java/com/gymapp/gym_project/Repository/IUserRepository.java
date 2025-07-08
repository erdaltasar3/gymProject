package com.gymapp.gym_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymapp.gym_project.Entity.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

}
