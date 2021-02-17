package pl.bolvis.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.BookService;

import java.util.List;

@Controller
public class ListController {

    private final BookService bookService;

    public ListController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        List<Book> books = bookService.getAllBooks(); //get all books from db via service
        mv.addObject("books", books);

        return mv;
    }
}
