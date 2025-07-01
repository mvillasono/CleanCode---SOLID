package com.solid.dip.refactored.factory;

import com.solid.dip.refactored.persistence.EmployeeMemoryPersistence;
import com.solid.dip.refactored.persistence.EmployeePersistence;

// Fábrica concreta que retorna una implementación en memoria de la persistencia
public class EmployeeMemoryPersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new EmployeeMemoryPersistence();
    }

}
