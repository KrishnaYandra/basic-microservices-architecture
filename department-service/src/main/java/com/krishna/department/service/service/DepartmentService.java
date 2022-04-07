package com.krishna.department.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishna.department.service.entity.Department;
import com.krishna.department.service.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department save(Department department) {
		// TODO Auto-generated method stub
		log.info("inside saveDepartment of DepartmentService");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long id) {
		// TODO Auto-generated method stub
		log.info("inside findDepartmentById of DepartmentService");
		return departmentRepository.findByDepartmentId(id);
	}
}
