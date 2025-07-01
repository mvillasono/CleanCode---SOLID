package com.solid.dip.refactored.factory;

import com.solid.dip.refactored.persistence.EmployeePersistence;

public interface EmployeeePersistenceFactory {

    public EmployeePersistence getEmployeePersistance();
}
