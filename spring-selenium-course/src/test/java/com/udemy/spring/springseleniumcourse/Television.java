package com.udemy.spring.springseleniumcourse;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Television {

    @Value("${tv.name:sony}")
    private String name;

    public Television(){
        //First part to be executed, this.name is null
        System.out.println("Inside the constructor: " + this.name);
    }

    @PostConstruct
    public void init(){
        //Second part to be executed, this.name is sony
        System.out.println("Inside the init: " + this.name);
        System.out.println("TV is turned on...");
    }

    public void playMovie(){
        //Third part to be executed
        for (int i = 1; i < 6; i++){
            System.out.println("Playing scene " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @PreDestroy
    public void turnOff(){
        //Last part to be exectued
        System.out.println("TV is turned off...");
    }

}
