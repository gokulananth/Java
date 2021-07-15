package com.example.demo.aspectprogramming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages = "com.example.demo.aspectprogramming")
public class MainAspect {


}
