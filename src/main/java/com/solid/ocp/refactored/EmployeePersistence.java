package com.solid.ocp.refactored;

import java.util.List;

// Interfaz para la persistencia de empleados
// Permite extender la funcionalidad sin modificar las clases existentes
public interface EmployeePersistence {
    public List<Employee> findAll();

    public void save(Employee employee);
}
