package com.solid.dip.refactored;

import com.solid.dip.refactored.factory.EmployeeePersistenceFactory;
import com.solid.dip.refactored.persistence.EmployeePersistence;

// Ejemplo CORRECTO: Esta clase cumple con el Principio de Inversión de Dependencias (DIP)
// porque depende de abstracciones (interfaces), no de implementaciones concretas.
public class Company {

    private EmployeePersistence persistence;

    // Recibe una fábrica abstracta para obtener la implementación de persistencia
    public Company(EmployeeePersistenceFactory persistenceFactory) {
        persistence = persistenceFactory.getEmployeePersistance();
    }

    public void addEmployee(Employee e) {
        persistence.save(e);
    }
}
