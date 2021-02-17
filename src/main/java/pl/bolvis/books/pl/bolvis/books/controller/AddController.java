package pl.bolvis.books.pl.bolvis.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;

@Controller
public class AddController {
    //connect to db
    @Autowired
    private BookRepo bookRepo;

    @RequestMapping("/add_form")
    public String addForm(){
        return "add";
    }

    @RequestMapping("/add_book")
    public String addBook(Book book){
        //insert new book
        bookRepo.save(book);
        return "redirect:/";
    }
}
