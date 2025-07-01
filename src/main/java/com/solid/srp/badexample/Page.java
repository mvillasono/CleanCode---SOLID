package com.solid.srp.badexample;

// Clase simple que representa una página de un libro
public class Page {
    private Integer number;
    private String content;

    public Page(Integer number, String content) {
        this.number = number;
        this.content = content;
    }

    // Devuelve el número de página
    public Integer getNumber() {
        return number;
    }

    // Devuelve el contenido de la página
    public String getContent() {
        return content;
    }
}
