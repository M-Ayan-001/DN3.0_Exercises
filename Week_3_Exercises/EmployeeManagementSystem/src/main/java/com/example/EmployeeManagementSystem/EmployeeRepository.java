package com.example.EmployeeManagementSystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	@Query("SELECT e.name as name, e.email as email, d.name as departmentName FROM Employee e JOIN e.department d")
	List<EmployeeProjection> findEmployeeProjections();
}
