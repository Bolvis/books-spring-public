package pl.bolvis.books.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.ListService;

import java.util.List;

@Controller
public class ListController {
    //connect to db
    private final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping("/")
    public ModelAndView list(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("list");
        List<Book> books = listService.getAllBooks(); //get all books from db via service
        mv.addObject("books", books);

        return mv;
    }
}
