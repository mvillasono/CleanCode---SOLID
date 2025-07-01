package com.solid.lsp.refactored;

// Ejemplo CORRECTO: Esta clase cumple con el Principio de Sustitución de Liskov (LSP)
// porque no asume comportamientos que no todos los mamíferos pueden realizar.
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

    // No se define el método walk() aquí, ya que no todos los mamíferos pueden caminar
}
