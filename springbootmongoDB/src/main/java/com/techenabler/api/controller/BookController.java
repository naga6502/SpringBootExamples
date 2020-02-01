package com.techenabler.api.controller;

import com.techenabler.api.model.Book;
import com.techenabler.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/addBook")
    public String saveBook(@RequestBody Book book){
        bookRepository.save(book);
        return "Added Book with ID = "+ book.getId();
    }

    @GetMapping("/getAllBooks")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    @GetMapping("/getBook/{id}")
    public Optional<Book> getBookById(@PathVariable int id){
        return bookRepository.findById(id);
    }

    @DeleteMapping("/deleteBook/{id}")
    public String deleteBookById(@PathVariable int id){
        bookRepository.deleteById(id);
        return "Deleted Book with ID = "+ id;
    }

}
