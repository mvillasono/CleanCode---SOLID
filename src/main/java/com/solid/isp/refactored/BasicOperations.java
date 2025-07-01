package com.solid.isp.refactored;

// Ejemplo CORRECTO: Esta interfaz cumple con el Principio de Segregación de Interfaces (ISP)
// porque solo define operaciones básicas, permitiendo que las clases implementen solo lo que necesitan.
public interface BasicOperations {
    public Double add(Double a, Double b);

    public Double subtract(Double a, Double b);

    public Double multiply(Double a, Double b);

    public Double divide(Double a, Double b);

}
