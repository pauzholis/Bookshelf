package ru.testproject.bookshelf.view;


import ru.testproject.bookshelf.model.Shelf;
import ru.testproject.bookshelf.model.User;

public class BookView {
    public Long id;
    public String name;
    public String author;
    public String description;
    public Long isbn;
    public User user;
    public String filePath;
    public Shelf shelf;
    public String shelfName;

    public BookView() {
    }

    public BookView(String name, String author, String description, Long isbn, User user, String filePath, Shelf shelf) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.user = user;
        this.filePath = filePath;
        this.shelf = shelf;
    }

    public BookView(String name, String author, String description, Long isbn, String filePath, Shelf shelf) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.isbn = isbn;
        this.shelf = shelf;
        this.filePath = filePath;
    }

    public Shelf getShelf() {
        return shelf;
    }

    public User getUser() {
        return user;
    }

    public String getFilePath() {
        return filePath;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setShelf(Shelf shelf) {
        this.shelf = shelf;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShelfName() {
        return shelfName;
    }

    public void setShelfName(String shelfName) {
        this.shelfName = shelfName;
    }
}

