package com.example.pojo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author INSKYBE
 * 2023/11/12
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private String mId;
    private String name;
    private String tel;
    private String department;
}
