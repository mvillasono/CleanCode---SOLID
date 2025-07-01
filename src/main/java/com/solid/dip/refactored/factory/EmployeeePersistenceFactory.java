package com.solid.dip.refactored.factory;

import com.solid.dip.refactored.persistence.EmployeePersistence;

// Interfaz de fábrica para obtener implementaciones de persistencia de empleados
public interface EmployeeePersistenceFactory {

    public EmployeePersistence getEmployeePersistance();
}
