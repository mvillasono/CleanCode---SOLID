package com.solid.dip.refactored.persistence;

import java.util.List;

import com.solid.dip.refactored.Employee;

// Interfaz para la persistencia de empleados
public interface EmployeePersistence {

    public List<Employee> findAll();

    public void save(Employee employee);
}
