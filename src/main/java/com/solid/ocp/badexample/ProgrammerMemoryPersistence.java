package com.solid.ocp.badexample;

import java.util.ArrayList;
import java.util.List;

// Clase que solo permite persistir programadores en memoria
// Si se quiere persistir otro tipo de empleado, habría que crear otra clase similar
public class ProgrammerMemoryPersistence {
    private List<Programmer> programmers;

    public ProgrammerMemoryPersistence() {
        programmers = new ArrayList<Programmer>();
    }

    // Devuelve la lista de programadores
    public List<Programmer> findAll() {
        return programmers;
    }

    // Guarda un programador en la lista
    public void save(Programmer programmer) {
        programmers.add(programmer);
    }
}
