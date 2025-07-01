package com.solid.srp.refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;

// Implementación de la interfaz BookPersistence que guarda el libro en un archivo
// Esta clase se encarga SOLO de la persistencia, cumpliendo SRP
public class BookFilePersistence implements BookPersistence {
    public static final String BOOK_DIRECTORY_PATH = "/tmp";

    @Override
    public void save(Book book) {
        String bookFilePath =
                BookFilePersistence.BOOK_DIRECTORY_PATH + "/" + book.getTitle() + "_"
                        + new Date().getTime();
        List<Page> bookPages = book.getPages();
        BufferedWriter writer;
        try {
            writer = new BufferedWriter(new FileWriter(bookFilePath));

            for (Page page : bookPages) {
                writer.write("---- Page " + page.getNumber() + " ----");
                writer.newLine();
                writer.write(page.getContent());
                writer.newLine();
            }

            writer.close();
        } catch (IOException e) {
            // Si ocurre un error al guardar, se lanza una excepción personalizada
            throw new BookPersistenceException();
        }

    }
}
