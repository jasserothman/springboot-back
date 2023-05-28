package com.jasser.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.jasser.springboot.models.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}