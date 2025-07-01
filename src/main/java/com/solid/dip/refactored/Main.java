package com.solid.dip.refactored;

import com.solid.dip.refactored.factory.MySqlEmployeePersistenceFactory;

// Clase principal para ejecutar el ejemplo de DIP
public class Main {

    public static void main(String[] args) {
        // Se crea la compañía usando una fábrica abstracta, cumpliendo DIP
        Company company = new Company(new MySqlEmployeePersistenceFactory());
    }

}
