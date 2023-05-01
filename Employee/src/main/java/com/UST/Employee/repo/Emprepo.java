package com.UST.Employee.repo;

import com.UST.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Emprepo extends JpaRepository<Employee, Integer> {
    Employee findByempId(String empId);
}
