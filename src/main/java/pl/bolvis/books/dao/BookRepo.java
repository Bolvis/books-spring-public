package pl.bolvis.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolvis.books.model.Book;

public interface BookRepo extends JpaRepository<Book, String> {
}
