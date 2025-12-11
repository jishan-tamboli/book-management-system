package lib.bookmanagementsystem.book.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue
    private Integer  id;

    @Column(name = "book_title",nullable = false)
    private String name;

    @Column(name ="book_author" , nullable = false)
    private String author;

    @Column(name ="book_price")
    private Double  price;

    @Column(name  ="book_quantity")
    private Integer  quantity;



}
