package ru.testproject.bookshelf.dao;


import org.springframework.data.repository.CrudRepository;
import ru.testproject.bookshelf.model.Book;

import java.util.List;

public interface BookDao extends CrudRepository<Book, Long> {
    /**
     * Получение книг по автору
     */
    List<Book> getAllByAuthor(String author);

    /**
     * Получение книг по названию
     */
    List<Book> getAllByName(String name);
}