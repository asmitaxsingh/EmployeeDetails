package com.springrest.springrest.controller;

import com.springrest.springrest.model.Employee;
import com.springrest.springrest.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepo EmployeeRepo;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return EmployeeRepo.findAll();
    }

}
