package pl.bolvis.books.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bolvis.books.model.Book;
import pl.bolvis.books.services.AddService;
import pl.bolvis.books.services.ListService;

import java.util.List;

@RestController
public class ExtraController {

    private final ListService listService;
    private final AddService addService;

    public ExtraController(ListService listService, AddService addService) {
        this.listService = listService;
        this.addService = addService;
    }
    
    @GetMapping("/getAllBooks")
    public @ResponseBody String getAllBooks() throws JsonProcessingException {
        List<Book> books = listService.getAllBooks();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
        return objectMapper.writeValueAsString(books);
    }
    
    @PostMapping("/addBook")
    public void addBook(Book book){
        addService.addBook(book);
    }
}
