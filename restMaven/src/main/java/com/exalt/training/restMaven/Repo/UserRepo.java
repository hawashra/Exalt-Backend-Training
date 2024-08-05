package com.exalt.training.restMaven.Repo;

import com.exalt.training.restMaven.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
