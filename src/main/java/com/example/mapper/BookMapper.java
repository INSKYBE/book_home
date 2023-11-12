package com.example.mapper;

import com.example.pojo.DTO.BookAddDTO;
import com.example.pojo.DTO.BookEditDTO;
import com.example.pojo.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@Mapper
public interface BookMapper {

    List<Book> listBooks();

    void save(BookAddDTO bookAddDTO);

    void deleteById(Long id);

    void update(BookEditDTO bookEditDTO);
}
