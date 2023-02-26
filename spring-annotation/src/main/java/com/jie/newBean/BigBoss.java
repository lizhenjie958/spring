package com.jie.newBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BigBoss {
//    @Autowired
    private BossCar bossCar;

    public BossCar getCar() {
        return bossCar;
    }

    //@Autowired
    //标注在方法，Spring容器创建当前对象，就会调用方法，完成赋值；
    //方法使用的参数，自定义类型的值从ioc容器中获取
    public void setCar(BossCar car) {
        this.bossCar = car;
    }


    // 构造器要用的组件，都是从容器中获取
//    @Autowired
    public BigBoss(@Autowired BossCar bossCar) {
        this.bossCar = bossCar;
        System.out.println("Boss...有参构造器");
    }

    @Override
    public String toString() {
        return "Boss [car=" + bossCar + "]";
    }

}
