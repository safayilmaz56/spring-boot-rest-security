package com.teknopar.springboot.cruddemo.repository;

import com.teknopar.springboot.cruddemo.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
