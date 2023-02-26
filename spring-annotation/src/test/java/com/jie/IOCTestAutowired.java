package com.jie;

import com.jie.bean.Car;
import com.jie.config.MainConfigOfAutowired;
import com.jie.newBean.BigBoss;
import com.jie.newBean.BossCar;
import com.jie.newBean.ColorCar;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestAutowired {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

//        BookService bookService = applicationContext.getBean(BookService.class);
//        System.out.println(bookService);

//        BookDao bean = applicationContext.getBean(BookDao.class);
//        System.out.println(bean);

        BigBoss boss = applicationContext.getBean(BigBoss.class);
        System.out.println(boss);
        BossCar car = applicationContext.getBean(BossCar.class);
        System.out.println(car);

        ColorCar color = applicationContext.getBean(ColorCar.class);
        System.out.println(color);



        System.out.println(applicationContext);
        applicationContext.close();
    }

}