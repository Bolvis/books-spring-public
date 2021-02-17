package pl.bolvis.books.services;

import org.springframework.stereotype.Service;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;

import java.util.List;

@Service
public class ListService {
    //connect to db
    private final BookRepo bookRepo;

    public ListService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }
}
