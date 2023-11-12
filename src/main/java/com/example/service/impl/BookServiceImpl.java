package com.example.service.impl;

import com.example.mapper.BookMapper;
import com.example.pojo.DTO.BookAddDTO;
import com.example.pojo.DTO.BookEditDTO;
import com.example.pojo.entity.Book;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> getBooks() {
        List<Book> books = bookMapper.listBooks();
        return books;
    }

    @Override
    public void saveBook(BookAddDTO bookAddDTO) {
        bookMapper.save(bookAddDTO);
    }

    @Override
    public void deleteBookById(Long id) {
        bookMapper.deleteById(id);
    }

    @Override
    public void update(BookEditDTO bookEditDTO) {
        bookMapper.update(bookEditDTO);
    }
}
