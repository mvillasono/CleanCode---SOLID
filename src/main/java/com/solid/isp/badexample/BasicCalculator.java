package com.solid.isp.badexample;

// Ejemplo INCORRECTO: Esta clase se ve forzada a implementar métodos que no necesita (seno y coseno),
// lanzando excepciones en esos métodos. Esto viola el ISP.
public class BasicCalculator implements Operations{
    @Override
    public Double add(Double a, Double b) {
        return a + b;
    }

    @Override
    public Double subtract(Double a, Double b) {
        return a - b;
    }

    @Override
    public Double multiply(Double a, Double b) {
        return a * b;
    }

    @Override
    public Double divide(Double a, Double b) {
        return a / b;
    }

    // Métodos innecesarios para una calculadora básica
    @Override
    public Double sine(Double angle) {
        throw new UnsupportedOperationException(
                "Basic Calculator does not support trigonometric operations");
    }

    @Override
    public Double cosine(Double angle) {
        throw new UnsupportedOperationException(
                "Basic Calculator does not support trigonometric operations");
    }
}
