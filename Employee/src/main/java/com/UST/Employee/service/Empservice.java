package com.UST.Employee.service;

import com.UST.Employee.model.Employee;
import com.UST.Employee.repo.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class Empservice {
    @Autowired
    private Emprepo repo;
    public  Employee createEmployee(Employee employee) {
        return repo.save(employee);
    }



    public List<Employee> getEmployees() {
        return repo.findAll();
    }

    public Employee getEmployeesById(String empId) {

        return repo.findById(empId).orElse(null);
    }


    public String deleteEmployeeById(String empId) {
        repo.deleteById(empId);
        return "the employee is deleted";
    }


}
