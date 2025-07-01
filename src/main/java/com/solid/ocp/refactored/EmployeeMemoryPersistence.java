package com.solid.ocp.refactored;

import java.util.ArrayList;
import java.util.List;

// Clase que permite persistir cualquier tipo de empleado en memoria
public class EmployeeMemoryPersistence implements EmployeePersistence{
    private List<Employee> employees;

    public EmployeeMemoryPersistence() {
        employees = new ArrayList<Employee>();
    }

    // Devuelve la lista de empleados
    public List<Employee> findAll() {
        return employees;
    }

    // Guarda un empleado en la lista
    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }
}
