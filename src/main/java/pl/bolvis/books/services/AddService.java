package pl.bolvis.books.services;

import org.springframework.stereotype.Service;
import pl.bolvis.books.dao.BookRepo;
import pl.bolvis.books.model.Book;

@Service
public class AddService {
    //connect to db
    private final BookRepo bookRepo;

    public AddService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public void addBook(Book book){
        String[] author = book.getAuthor().split(" ");
        String name = author[0];
        String surname = author[author.length - 1];
        if('A' == name.charAt(0) || 'A' == surname.charAt(0)){
            bookRepo.save(book);
            return;
        }
        System.out.println("meatball"); //I wish u know what it is
    }
}
