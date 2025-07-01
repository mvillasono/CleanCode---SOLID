package com.solid.ocp.refactored;

// Clase base para cualquier tipo de empleado
public class Employee {
    private String fullName;
    private Integer salary;

    public Employee(String fullName, Integer salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    // Devuelve el nombre completo del empleado
    public String getFullName() {
        return fullName;
    }

    // Devuelve el salario del empleado
    public Integer getSalary() {
        return salary;
    }
}
