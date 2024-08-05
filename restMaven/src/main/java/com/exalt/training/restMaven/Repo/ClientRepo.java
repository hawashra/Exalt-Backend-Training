package com.exalt.training.restMaven.Repo;

import com.exalt.training.restMaven.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepo extends JpaRepository<Client, Long> {
}
