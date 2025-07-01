package com.solid.lsp.badexample;

// Ejemplo INCORRECTO: Esta clase viola el Principio de Sustitución de Liskov (LSP)
// porque asume que todos los mamíferos pueden caminar, lo cual no es cierto (por ejemplo, los delfines).
public class Mammal {
    private Integer weight;
    private Integer ageInDays;

    // Devuelve el peso del mamífero
    public Integer getWeight() {
        return weight;
    }

    // Devuelve la edad en días del mamífero
    public Integer getAgeInDays() {
        return ageInDays;
    }

    // Método que asume que todos los mamíferos pueden caminar
    public void walk() {
        System.out.println("I am walking");
    }
}
