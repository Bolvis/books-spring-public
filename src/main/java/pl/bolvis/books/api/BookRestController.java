package pl.bolvis.books.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bolvis.books.model.Author;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.BookService;

import java.util.List;

@RestController
public class BookRestController {

    private final BookService bookService;

    public BookRestController(BookService bookService) {
       this.bookService = bookService;
    }
    
    @GetMapping("/getAllBooks")
    public @ResponseBody List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    
    @PostMapping("/addBook")
    public @ResponseBody Book addBook(Book book, Author author){
        return bookService.addBook(book, author);
    }
}
