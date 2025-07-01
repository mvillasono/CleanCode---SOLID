package com.solid.dip.badexample;

import java.util.List;

// Ejemplo INCORRECTO: Esta clase viola el Principio de Inversión de Dependencias (DIP)
// porque depende directamente de una implementación concreta (EmployeeMemoryPersistence).
public class Company {

    private EmployeePersistence persistence;

    public Company() {
        // Aquí se instancia directamente la implementación concreta.
        persistence = new EmployeeMemoryPersistence();
    }

    public List<Employee> getEmployees() {
        return persistence.findAll();
    }

    public void addEmployee(Employee e) {
        persistence.save(e);
    }
}
