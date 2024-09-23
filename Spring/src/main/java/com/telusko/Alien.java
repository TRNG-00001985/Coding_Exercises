package com.telusko;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
   @Autowired
    //@Qualifier("laptop")
    private Computer com;
//    public Alien(int age, Computer com){
//        System.out.println("Parameterised Constructor...");
//        this.age = age;
//        this.lap = lap;
//        System.out.println(this.age);
//    }
    public Alien(){
        System.out.println("Alien Object created...");
    }

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void code(){
        System.out.println("Coding...");
        com.compile();
    }

}
