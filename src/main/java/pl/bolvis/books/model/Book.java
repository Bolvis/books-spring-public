package pl.bolvis.books.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "books")
public @Data
class Book {

    @Id
    private String isbn;
    private String title;
    private String author;

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
