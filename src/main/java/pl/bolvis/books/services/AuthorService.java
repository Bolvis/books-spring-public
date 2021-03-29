package pl.bolvis.books.services;

import org.springframework.stereotype.Service;
import pl.bolvis.books.dao.AuthorRepository;
import pl.bolvis.books.model.Author;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }

    public Author addAuthor(Author author){
        authorRepository.findAll();
        Long id = matchAuthor(author);
        if (id == -1){
            authorRepository.save(author);
        }
        return authorRepository.getOne(id);
    }

    private Long matchAuthor(Author author){
        List<Author> authors = authorRepository.findAll();
        for (Author item: authors){
            if (author.getName().equals(item.getName()) && author.getSurname().equals(item.getSurname())){
                return item.getId();
            }
        }
        return (long) -1;
    }
}
