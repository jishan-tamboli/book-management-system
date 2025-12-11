package lib.bookmanagementsystem.book.controller;

import lib.bookmanagementsystem.book.entity.Book;
import lib.bookmanagementsystem.book.service.BookService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book/v1")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PutMapping("/updateBook/{id}")
    public ResponseEntity<Book> updateBook(
            @PathVariable Integer id,
            @RequestBody Book updatedBook
    ){
        Book book = bookService.updateBook(id, updatedBook);
        return ResponseEntity.ok(book);
    }



    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        Book savedBook = bookService.addBook(book);
        return ResponseEntity.ok(savedBook);

    }

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return ResponseEntity.ok(books);
    }


    @GetMapping("/getBookByAuthor/{author}")
    public ResponseEntity<Book> getBookByAuthor(@PathVariable String author) {
        Book book = bookService.getBookByAuthor(author);
        return ResponseEntity.ok(book);
    }


    @GetMapping("/getBookByPrice/{price}")
    public ResponseEntity<Book> getBookByPrice(@PathVariable Double price) {
        Book book = bookService.getBookByPrice(price);
        return ResponseEntity.ok(book);
    }


    @GetMapping("/getBookByName/{name}")
    public ResponseEntity<Book> getBookByName(@PathVariable String name) {
        Book book = bookService.getBookByName(name);
        return ResponseEntity.ok(book);
    }
    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
        return ResponseEntity.ok("Book deleted successfully with id: " + id);
    }



}
