package com.solid.dip.refactored.persistence;

import java.util.ArrayList;
import java.util.List;

import com.solid.dip.refactored.Employee;

// Implementación concreta de la persistencia de empleados en una base de datos MySQL
public class MySqlEmployeePersistence implements EmployeePersistence {

    public MySqlEmployeePersistence(String url, String user, String password) {

    }

    @Override
    public List<Employee> findAll() {
        // Aquí iría la consulta a la base de datos
        return new ArrayList<Employee>();
    }

    @Override
    public void save(Employee employee) {
        // Aquí iría el guardado en la base de datos

    }
}
