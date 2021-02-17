package pl.bolvis.books.dao;

import pl.bolvis.books.model.Book;
import org.springframework.data.repository.CrudRepository;
//please remember it's Crud not Curd
public interface BookRepo extends CrudRepository<Book, String>{
}
