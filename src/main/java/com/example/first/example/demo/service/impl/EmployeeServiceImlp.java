package com.example.first.example.demo.service.impl;

import com.example.first.example.demo.entity.EmployeeEntity;
import com.example.first.example.demo.repository.EmployeeRepository;
import com.example.first.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImlp implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImlp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeEntity> findAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<EmployeeEntity> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
