package com.kuang.dao;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * @author 梁志超
 * @version 1.0
 * @time 2023/3/20 17:49
 */
public interface BookMapper {
    //增加
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookId") int bookID);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(@Param("bookId") int bookID);
    //查询全部书
    List<Books> queryAllBook();
}
