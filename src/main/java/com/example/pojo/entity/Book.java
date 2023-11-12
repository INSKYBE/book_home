package com.example.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private String bId;
    private String name;
    private Double price;
    private Integer number;
    private LocalDateTime date;
    private String pubHouse;
    private String mId;
}
