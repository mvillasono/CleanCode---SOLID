package com.solid.srp.badexample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

// Ejemplo INCORRECTO: Esta clase viola el Principio de Responsabilidad Única (SRP)
// porque maneja tanto la lógica del libro como la persistencia (guardar en archivo).
public class Book {
    public static final String BOOK_DIRECTORY_PATH = "/tmp";

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

    // Este método guarda el libro en un archivo.
    // Aquí está el problema: la clase Book no debería encargarse de la persistencia.
    public void save() throws IOException {
        String bookFilePath =
                Book.BOOK_DIRECTORY_PATH + "/" + this.title + "_" + new Date().getTime();
        BufferedWriter writer = new BufferedWriter(new FileWriter(bookFilePath));
        for (Page page : pages) {
            writer.write("---- Page " + page.getNumber() + " ----");
            writer.newLine();
            writer.write(page.getContent());
            writer.newLine();
        }
        writer.close();
    }
}
