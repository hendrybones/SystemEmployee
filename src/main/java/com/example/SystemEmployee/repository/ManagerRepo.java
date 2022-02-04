package com.example.SystemEmployee.repository;

import com.example.SystemEmployee.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepo extends JpaRepository<Manager, Long> {
}
