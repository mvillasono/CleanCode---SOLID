package com.solid.ocp.refactored;

import java.util.List;

// Ejemplo CORRECTO: Esta clase cumple con el Principio de Abierto/Cerrado (OCP)
/// porque puede trabajar con cualquier tipo de empleado sin modificar la clase.
public class Company {
    private EmployeePersistence persistence;

    public Company() {
        persistence = new EmployeeMemoryPersistence();
    }

    // Devuelve todos los empleados, sin importar el tipo
    public List<Employee> getEmployees() {
        return persistence.findAll();
    }

    // Permite agregar cualquier tipo de empleado (Programmer, Manager, etc.)
    public void addEmployee(Employee e) {
        persistence.save(e);
    }
}
