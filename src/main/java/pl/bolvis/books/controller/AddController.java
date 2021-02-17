package pl.bolvis.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.AddService;

@Controller
public class AddController {
    //connect to db
    private final AddService addService;

    public AddController(AddService addService) {
        this.addService = addService;
    }

    @GetMapping("/add_form")
    public String addForm(){
        return "add";
    }

    @PostMapping("/add_book")
    public String addBook(Book book){
        addService.addBook(book);

        return "redirect:/";
    }
}
