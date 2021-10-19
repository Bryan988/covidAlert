package com.springbootapi.project.repositories;

import com.springbootapi.project.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
