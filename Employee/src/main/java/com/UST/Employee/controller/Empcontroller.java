package com.UST.Employee.controller;

import com.UST.Employee.model.Employee;
import com.UST.Employee.service.Empservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class Empcontroller {
    @Autowired
    private Empservice empservice;

    @PostMapping("/emp")
    public Employee address(@RequestBody Employee employee) {

        return empservice.createEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {

        return empservice.getEmployees();

    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployeeById(@PathVariable String empId) {

        return empservice.getEmployeesById(empId);

    }
    @DeleteMapping("deletemployee/{id}")
    public String deleteEmployee(@PathVariable String empId) {

        return empservice.deleteEmployeeById(empId);
    }
}


