package com.example.service;

import com.example.pojo.DTO.BookAddDTO;
import com.example.pojo.DTO.BookEditDTO;
import com.example.pojo.entity.Book;

import java.util.List;

/**
 * @author INSKYBE
 * 2023/11/12
 */
public interface BookService {
    List<Book> getBooks();

    void saveBook(BookAddDTO bookAddDTO);

    void deleteBookById(Long id);

    void update(BookEditDTO bookEditDTO);
}
