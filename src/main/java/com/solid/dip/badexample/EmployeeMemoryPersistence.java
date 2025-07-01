package com.solid.dip.badexample;

import java.util.ArrayList;
import java.util.List;

// Implementación concreta de la persistencia de empleados en memoria
public class EmployeeMemoryPersistence implements EmployeePersistence {

    private List<Employee> employees;

    public EmployeeMemoryPersistence() {
        employees = new ArrayList<Employee>();
    }

    public List<Employee> findAll() {
        return employees;
    }

    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }
}
