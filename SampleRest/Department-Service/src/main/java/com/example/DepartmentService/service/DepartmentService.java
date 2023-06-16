package com.example.DepartmentService.service;

import com.example.DepartmentService.entity.Department;
import com.example.DepartmentService.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;
    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.save(department);
    }

    public Department findByDepartmentId(Long departmentId) {
        log.info("Inside saveDepartment of DepartmentService");
        return departmentRepository.findAllByDepartmentId(departmentId);
    }


}
