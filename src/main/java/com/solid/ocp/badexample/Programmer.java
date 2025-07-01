package com.solid.ocp.badexample;

// Clase que representa un programador
public class Programmer {
    private String fullName;
    private Integer salary;

    public Programmer(String fullName, Integer salary) {
        this.fullName = fullName;
        this.salary = salary;
    }

    // Devuelve el nombre completo del programador
    public String getFullName() {
        return fullName;
    }

    // Devuelve el salario del programador
    public Integer getSalary() {
        return salary;
    }
}
