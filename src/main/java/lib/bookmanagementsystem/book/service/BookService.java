package lib.bookmanagementsystem.book.service;

import lib.bookmanagementsystem.book.entity.Book;
import lib.bookmanagementsystem.book.repo.BookRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    private final BookRepo bookRepo;


    public BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }


    public Book addBook(Book book) {

        return bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public Book getBookByAuthor(String author) {
        return bookRepo.findByAuthor(author);
    }

    public Book getBookByPrice(Double price) {
        return bookRepo.findByPrice(price);
    }

    public Book getBookByName(String name){
        return bookRepo.findByName(name);
    }

    public Book getBookById(Integer id){
     return bookRepo.findById(id).orElse(null);
    }

    public  Book updateBook(Integer id , Book updatedBook){
        Book existing = bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book Not Found"));
        existing.setName(updatedBook.getName());
        existing.setAuthor(updatedBook.getAuthor());
        existing.setPrice(updatedBook.getPrice());
        existing.setQuantity(updatedBook.getQuantity());

        return bookRepo.save(existing);
    }

    public void deleteBook(Integer id){
       Book book = bookRepo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        bookRepo.delete(book);

    }


}
