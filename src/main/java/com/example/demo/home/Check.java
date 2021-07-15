package com.example.demo.home;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.HashSet;

@Component
public class Check {
//    @Bean
//    public HashSet getSet(){
//        return new HashSet<String>();
//    }

    @Bean
    public HashMap getMap(){
        return new HashMap<String,Object>();
    }
}
