package pl.bolvis.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolvis.books.model.Book;

public interface BookRepository extends JpaRepository<Book, String> {
}
