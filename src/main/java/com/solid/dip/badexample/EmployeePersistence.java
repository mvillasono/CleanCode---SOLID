package com.solid.dip.badexample;

import java.util.List;

// Interfaz para la persistencia de empleados
public interface EmployeePersistence {

    public List<Employee> findAll();

    public void save(Employee employee);
}
