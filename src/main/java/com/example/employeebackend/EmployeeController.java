package com.example.employeebackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @PostMapping()
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @DeleteMapping("/{empId}")
    public void deleteEmployee(@PathVariable("empId") long empId) {
        System.out.println("empId = " + empId);
        employeeService.deleteEmployee(empId);
    }

    @PutMapping("/name/{empId}")
    public void updateEmployeeFirstName(@RequestBody Employee emp, @PathVariable("empId") long id) {
        System.out.println("emp = " + emp + ", id = " + id);
        employeeService.updateEmployeeFirstname(emp.getFirstName(), id);
    }

    @GetMapping("/{empId}")
    public Employee getEmployeeById(@PathVariable("empId") long empId) {
        return employeeService.getEmployeeById(empId);
    }

    @PutMapping("/{empId}")
    public void updateEmployee(@PathVariable("empId") long empId, @RequestBody Employee emp) {
        employeeService.updateEmployee(emp,empId);
    }

}
