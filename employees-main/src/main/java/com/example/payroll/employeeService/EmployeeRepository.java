package com.example.payroll.employeeService;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    public Optional<Employee> findByEmail(String email);
    List<Employee> findByNameStartingWithIgnoreCase(String prefix);

}