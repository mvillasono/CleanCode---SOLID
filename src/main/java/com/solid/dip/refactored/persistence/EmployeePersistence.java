package com.solid.dip.refactored.persistence;

import java.util.List;

import com.solid.dip.refactored.Employee;

public interface EmployeePersistence {

    public List<Employee> findAll();

    public void save(Employee employee);
}
