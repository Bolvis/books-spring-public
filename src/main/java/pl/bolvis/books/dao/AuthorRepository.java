package pl.bolvis.books.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.bolvis.books.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
