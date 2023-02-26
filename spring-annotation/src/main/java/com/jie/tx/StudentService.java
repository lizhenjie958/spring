package com.jie.tx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;

@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional
    public void insertStudent(){
        studentDao.insert();
        System.out.println("插入完成");
        int a = 10 / 0;
    }
}
