/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ervan.kuliah.departmen.controller;

import com.ervan.kuliah.departmen.entity.Department;
import com.ervan.kuliah.departmen.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author FX506PE
 */
@RestController
@RequestMapping("/departments") 
@Slf4j 
public class DepartmentController {
    @Autowired 
    private DepartmentService departmentService;
    
    @PostMapping("/")
    public Department saveDepartment(@RequestBody  Department department){
        log.info("Method saveDepartment pada DepartmentController"); 
        return departmentService.saveDepartment(department);
    }
    
    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId){
        log.info("inside findDepartmentById method of DepartmentController");
         return departmentService.findDepartmentById(departmentId);
    }
}
