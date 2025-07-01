package com.solid.ocp.refactored;

// Clase que representa un gerente, extiende de Employee
public class Manager extends Employee{
    private Integer bonus;

    public Manager(String fullName, Integer salary, Integer bonus) {
        super(fullName, salary);
        this.bonus = bonus;
    }

    // Devuelve el bono del gerente
    public Integer getBonus() {
        return bonus;
    }
}
