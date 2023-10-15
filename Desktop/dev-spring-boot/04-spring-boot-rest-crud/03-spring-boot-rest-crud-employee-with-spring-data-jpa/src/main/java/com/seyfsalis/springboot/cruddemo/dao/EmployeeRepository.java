package com.seyfsalis.springboot.cruddemo.dao;

import com.seyfsalis.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
