package com.solid.srp.refactored;

// Interfaz para la persistencia de libros
// Permite separar la lógica de negocio de la lógica de almacenamiento
public interface BookPersistence {
    public void save(Book book);
}
