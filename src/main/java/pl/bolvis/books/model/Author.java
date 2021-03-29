package pl.bolvis.books.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "author")
public class Author {

    @Id
    private long id;
    private String name;
    private String surname;
}

