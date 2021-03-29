package pl.bolvis.books.services;

import org.springframework.stereotype.Service;
import pl.bolvis.books.dao.BookRepository;
import pl.bolvis.books.model.Author;
import pl.bolvis.books.model.Book;

import javax.xml.bind.ValidationException;
import java.util.List;

@Service
public class BookService {

    //connect to db
    private final BookRepository bookRepository;
    private final AuthorService authorService;

    public BookService(BookRepository bookRepository, AuthorService authorService) {
        this.bookRepository = bookRepository;
        this.authorService = authorService;
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book addBook(Book book, Author author){
        try{
            String name = author.getName();
            String surname = author.getSurname();
            if('A' == name.charAt(0) || 'A' == surname.charAt(0)){
                author = authorService.addAuthor(author);
                book.setAuthor(author);
                bookRepository.save(book);
                return book;
            }
            throw new ValidationException("meatball: Name or surname must start with 'A'"); //I wish u know what it is
        }catch (ValidationException e){
            e.printStackTrace();
            return null;
        }
    }
}
