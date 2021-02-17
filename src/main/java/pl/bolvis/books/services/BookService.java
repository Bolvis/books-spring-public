package pl.bolvis.books.services;

import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.stereotype.Service;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;

import javax.xml.bind.ValidationException;
import java.util.List;

@Service
public class BookService {

    //connect to db
    private final BookRepo bookRepo;

    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks(){
        return bookRepo.findAll();
    }

    public void addBook(Book book){
        try{
            String[] author = book.getAuthor().split(" ");
            String name = author[0];
            String surname = author[author.length - 1];
            if('A' == name.charAt(0) || 'A' == surname.charAt(0)){
                bookRepo.save(book);
                return;
            }
            throw new ValidationException("meatball"); //I wish u know what it is
        }catch (ValidationException e){
            System.err.println(e.getMessage());
        }
    }
}
