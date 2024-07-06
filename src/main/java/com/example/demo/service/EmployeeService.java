package com.example.demo.service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    public void saveEmployee(Employee employee) {
        repository.save(employee);
    }
    public Employee getEmployeeById(Long id) {
        return repository.findById(id).orElse(null);
    }
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}

