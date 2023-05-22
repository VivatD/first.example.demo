package com.example.first.example.demo.controller;

import com.example.first.example.demo.entity.EmployeeEntity;
import com.example.first.example.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<EmployeeEntity> findAllEmployee(){
        return employeeService.findAllEmployee();
    }

    @GetMapping("/{id}")
    public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
        return employeeService.findById(id);
    }

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return  employeeService.saveEmployee(employeeEntity);
    }

    @DeleteMapping("/id")
    public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.updateEmployee(employeeEntity);
    }


}
