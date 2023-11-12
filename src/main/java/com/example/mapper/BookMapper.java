package com.example.mapper;

import com.example.pojo.DTO.BookAddDTO;
import com.example.pojo.DTO.BookEditDTO;
import com.example.pojo.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@Mapper
public interface BookMapper {

    @Select("SELECT * FROM books")
    List<Book> listBooks();

    @Insert("INSERT INTO books(b_id,name,number,price,date,pubHouse,m_id)" +
            "VALUES (#{bId}, #{name}, #{number}, #{price}, #{date},#{pubHouse},#{mId})")
    void save(BookAddDTO bookAddDTO);

    @Delete("delete from books where b_id = #{id}")
    void deleteById(Long id);

    @Update("UPDATE books set name=#{name} ,price=#{price} ,number=#{number}, date=#{date} , pubHouse=#{pubHouse} , m_id= #{mId} WHERE b_id = #{bId};")
    void update(BookEditDTO bookEditDTO);
}
