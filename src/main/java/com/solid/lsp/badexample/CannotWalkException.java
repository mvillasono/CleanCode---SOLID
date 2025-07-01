package com.solid.lsp.badexample;

// Excepción personalizada lanzada cuando un mamífero no puede caminar
public class CannotWalkException extends RuntimeException {
    public CannotWalkException(String message) {
        super(message);
    }
}
