package com.example.EmployeeManagementSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

	@Autowired
	private DepartmentRepository departmentRepository;

	@GetMapping
	public List<Department> getAllDepartments() {
		return departmentRepository.findAll();
	}

	@PostMapping
	public Department createDepartment(@RequestBody Department department) {
		return departmentRepository.save(department);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Department> updateDepartment(@PathVariable Long id,
			@RequestBody Department departmentDetails) {
		Department department = departmentRepository.findById(id).orElseThrow();

		department.setName(departmentDetails.getName());

		final Department updatedDepartment = departmentRepository.save(department);
		return ResponseEntity.ok(updatedDepartment);
	}

	@DeleteMapping("/{id}")
	public Map<String, Boolean> deleteDepartment(@PathVariable Long id) {
		Department department = departmentRepository.findById(id).orElseThrow();

		departmentRepository.delete(department);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
