package com.solid.dip.refactored.factory;

import com.solid.dip.refactored.persistence.EmployeeMemoryPersistence;
import com.solid.dip.refactored.persistence.EmployeePersistence;

public class EmployeeMemoryPersistenceFactory implements EmployeeePersistenceFactory {

    @Override
    public EmployeePersistence getEmployeePersistance() {
        return new EmployeeMemoryPersistence();
    }

}
