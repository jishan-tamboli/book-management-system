package lib.bookmanagementsystem.book.repo;

import lib.bookmanagementsystem.book.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book , Integer> {

    Book findByName(String name);

    Book findByAuthor(String author);

    Book findByPrice(Double price);




}
