package com.jie;

import com.jie.tx.StudentService;
import com.jie.tx.TxConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestTx {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.insertStudent();
        applicationContext.close();
    }
}
