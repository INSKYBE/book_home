package com.example.controller;

import com.example.pojo.DTO.BookAddDTO;
import com.example.pojo.DTO.BookEditDTO;
import com.example.pojo.entity.Book;
import com.example.pojo.entity.Result;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@RestController
@RequestMapping("/admin")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping()
    public Result<List<Book>> page() {
        List<Book> books = new ArrayList<>();
        books = bookService.getBooks();
        return Result.success(books);
    }

    @PostMapping()
    public Result addBook(@RequestBody BookAddDTO bookAddDTO) {
        bookService.saveBook(bookAddDTO);
        return Result.success(bookAddDTO);
    }

    @DeleteMapping()
    public Result deleteBook(Long id) {
        bookService.deleteBookById(id);
        return Result.success();
    }

    @PutMapping()
    public Result editBook(BookEditDTO bookEditDTO){
        bookService.update(bookEditDTO);
        return Result.success();
    }
}
