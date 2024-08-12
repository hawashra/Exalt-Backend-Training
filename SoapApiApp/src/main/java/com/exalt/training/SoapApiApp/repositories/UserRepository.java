package com.exalt.training.SoapApiApp.repositories;

import com.exalt.training.SoapApiApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
