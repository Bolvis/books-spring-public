package pl.bolvis.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.bolvis.books.model.Author;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.BookService;

@Controller
public class AddController {

    private final BookService bookService;

    public AddController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/add_form")
    public String addForm(){
        return "add";
    }

    @PostMapping("/add_book")
    public String addBook(Book book, Author author){
        bookService.addBook(book, author); //add book to db via service
        return "redirect:/"; //redirect to home page
    }
}
