package com.jie.newBean;

import org.springframework.stereotype.Component;

@Component
public class BossCar {

    public BossCar(){
        System.out.println("bossCar constructor...");
    }

    public void init(){
        System.out.println("bossCar ... init...");
    }

    public void detory(){
        System.out.println("bossCar ... detory...");
    }

}
