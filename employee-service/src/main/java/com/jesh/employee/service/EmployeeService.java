package com.jesh.employee.service;

import com.jesh.employee.model.Employee;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {

    private final Map<Long, Employee> employeeMap = new HashMap<>();

    @PostConstruct
    public void loadEmployees() {

        employeeMap.put(1L, Employee.builder()
                .id(1L)
                .firstName("Jeshwanth")
                .lastName("Lokesh")
                .email("jeshwanth@example.com")
                .department("Engineering")
                .designation("Senior Software Engineer")
                .salary(3000000.0)
                .build());

        employeeMap.put(2L, Employee.builder()
                .id(2L)
                .firstName("John")
                .lastName("Doe")
                .email("john@example.com")
                .department("Finance")
                .designation("Business Analyst")
                .salary(1800000.0)
                .build());

        employeeMap.put(3L, Employee.builder()
                .id(3L)
                .firstName("Alice")
                .lastName("Smith")
                .email("alice@example.com")
                .department("HR")
                .designation("Manager")
                .salary(2200000.0)
                .build());
    }

    public Collection<Employee> getAllEmployees() {
        return employeeMap.values();
    }

    public Employee getEmployeeById(Long id) {
        return employeeMap.get(id);
    }

    public Employee saveEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
        return employee;
    }

    public Employee updateEmployee(Long id, Employee employee) {
        employee.setId(id);
        employeeMap.put(id, employee);
        return employee;
    }

    public void deleteEmployee(Long id) {
        employeeMap.remove(id);
    }
}
