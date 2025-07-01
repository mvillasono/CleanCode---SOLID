package com.solid.ocp.badexample;

import java.util.List;

// Ejemplo INCORRECTO: Esta clase viola el Principio de Abierto/Cerrado (OCP)
// porque solo permite trabajar con programadores. Si se quiere agregar otro tipo de empleado,
// habría que modificar la clase y duplicar lógica.
public class Company {
    private ProgrammerMemoryPersistence persistence;

    public Company() {
        persistence = new ProgrammerMemoryPersistence();
    }

    // Solo devuelve programadores, no es extensible para otros empleados
    public List<Programmer> getProgrammers() {
        return persistence.findAll();
    }

    // Solo permite agregar programadores, no otros tipos de empleados
    public void addProgrammer(String fullName, Integer salary) {
        persistence.save(new Programmer(fullName, salary));
    }
}
