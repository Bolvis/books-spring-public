package pl.bolvis.books.pl.bolvis.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;

import java.util.List;

@Controller
public class ListController {
    //connect to db
    @Autowired
    private BookRepo bookRepo;

    @RequestMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        //get all books from db
        List<Book> books = (List<Book>) bookRepo.findAll();
        mv.addObject("books", books);
        return mv;
    }
}
