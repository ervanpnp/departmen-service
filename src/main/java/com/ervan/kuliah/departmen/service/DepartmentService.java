/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ervan.kuliah.departmen.service;

import com.ervan.kuliah.departmen.entity.Department;
import com.ervan.kuliah.departmen.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author FX506PE
 */
@Service
@Slf4j
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        log.info("Inside saveDepartment of DeparmentService"); 
        return departmentRepository.save(department);
    } 

    public Department findDepartmentById(Long departmentId) {
        log.info("Inside findDepartmentById of DeparmentService"); 
        return departmentRepository.findByDepartmentId(departmentId); 
    }
}
