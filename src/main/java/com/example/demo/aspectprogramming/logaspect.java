package com.example.demo.aspectprogramming;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

@Component
@Aspect
public class logaspect {
    private java.util.logging.Logger logger= java.util.logging.Logger.getLogger(MainAspect.class.getName());
    @After("execution(* com.example.demo.home.Home.home(..))")
    public void logBefore(JoinPoint joinPoint)
    {
        logger.info("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }


}

