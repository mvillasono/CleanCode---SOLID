
package com.solid.dip.refactored;


import com.solid.dip.refactored.factory.EmployeeePersistenceFactory;
import com.solid.dip.refactored.persistence.EmployeePersistence;

public class Company {

    private EmployeePersistence persistence;

    public Company(EmployeeePersistenceFactory persistenceFactory) {
        persistence = persistenceFactory.getEmployeePersistance();
    }

    public void addEmployee(Employee e) {
        persistence.save(e);
    }
}
