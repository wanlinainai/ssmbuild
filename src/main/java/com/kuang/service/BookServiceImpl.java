package com.kuang.service;

import com.kuang.dao.BookMapper;
import com.kuang.pojo.Books;

import java.util.List;

/**
 * @author 梁志超
 * @version 1.0
 * @time 2023/3/20 18:13
 */
//service 调用dao层
public class BookServiceImpl implements BookService{
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int bookID) {
        return bookMapper.deleteBookById(bookID);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int bookID) {
        return bookMapper.queryBookById(bookID);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
