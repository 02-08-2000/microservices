package com.UST.Employee.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="emp_tab")

public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String empId;
    private String name;
    private String email;
    private String designation;
    private String hr;

}
