package com.jie.service;

import com.jie.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

@Service
public class BookService {
//    @Autowired(required = false)
//    @Qualifier("bookDao")
    @Resource
//    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }


    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
