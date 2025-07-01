package com.solid.srp.refactored;

import java.util.List;

// Ejemplo CORRECTO: Esta clase cumple con el Principio de Responsabilidad Única (SRP).
    // Solo maneja la lógica del libro, NO la persistencia.
public class Book {
    private String title;
    private String author;
    private List<Page> pages;
    private Page currentPage;

    public Book(String title, String author, List<Page> pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.currentPage = this.pages.get(0);
    }

    // Devuelve el título del libro
    public String getTitle() {
        return title;
    }

    // Devuelve el autor del libro
    public String getAuthor() {
        return author;
    }

    // Devuelve la página actual
    public Page getCurrentPage() {
        return currentPage;
    }

    // Devuelve todas las páginas del libro
    public List<Page> getPages() {
        return pages;
    }

    // Avanza a la siguiente página
    public void turnPage() {
        Integer nextPageIndex = currentPage.getNumber();
        if (nextPageIndex <= pages.size()) {
            currentPage = pages.get(nextPageIndex);
        }
    }

    // Retrocede a la página anterior
    public void turnPageBack() {
        Integer previousPageIndex = currentPage.getNumber() - 2;
        if (previousPageIndex >= 0) {
            currentPage = pages.get(previousPageIndex);
        }
    }
}
