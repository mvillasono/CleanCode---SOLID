package com.solid.dip.refactored.factory;

import com.solid.dip.refactored.persistence.EmployeePersistence;
import com.solid.dip.refactored.persistence.MySqlEmployeePersistence;

// Fábrica concreta que retorna una implementación MySQL de la persistencia
public class MySqlEmployeePersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new MySqlEmployeePersistence(System.getProperty("url"),
                System.getProperty("user"), System.getProperty("password"));
    }

}
