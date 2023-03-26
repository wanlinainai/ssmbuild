package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 梁志超
 * @version 1.0
 * @time 2023/3/20 18:12
 */
public interface BookService {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(int bookID);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(int bookID);
    //查询全部书
    List<Books> queryAllBook();
}
