package com.gymapp.gym_project.repository;
import com.gymapp.gym_project.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<Role, Long> {
}
