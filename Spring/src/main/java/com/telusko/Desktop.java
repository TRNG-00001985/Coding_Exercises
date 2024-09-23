package com.telusko;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop object Created...");
    }
    @Override
    public void compile(){
        System.out.println("Code compiling... using Desktop");
    }
}
