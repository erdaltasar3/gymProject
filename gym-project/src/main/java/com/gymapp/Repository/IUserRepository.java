package com.gymapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gymapp.Entities.User;

@Repository
public interface IUserRepository extends JpaRepository<User, Long>{

}
