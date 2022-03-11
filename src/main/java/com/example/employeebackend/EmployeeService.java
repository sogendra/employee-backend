package com.example.employeebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(Employee emp) {
        employeeRepository.save(emp);
    }

    public void deleteEmployee(long id) {
        employeeRepository.deleteById(id);
    }

    public void updateEmployeeFirstname(String firstName, long empId) {
        employeeRepository.updateEmployeeFirstNameById(empId, firstName);
    }

    public Employee getEmployeeById(long empId) {
        return employeeRepository.getById(empId);
    }

    public void updateEmployee(Employee emp, long empId) {
        boolean exists = employeeRepository.existsById(empId);
        if(exists) {
            emp.setId(empId);
            employeeRepository.save(emp);
        }
    }
}
