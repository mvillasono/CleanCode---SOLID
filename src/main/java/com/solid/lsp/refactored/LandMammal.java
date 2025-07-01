package com.solid.lsp.refactored;

// Clase que representa mamíferos terrestres, solo estos pueden caminar
public class LandMammal extends Mammal{
    // Método específico para mamíferos terrestres
    public void walk() {
        System.out.println("I am walking");
    }
}
