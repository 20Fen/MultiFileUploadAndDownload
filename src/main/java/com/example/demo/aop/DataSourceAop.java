package com.example.demo.aop;

import com.config.DataSourceType;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Description:
 */
@Aspect
@Component
public class DataSourceAop {

    //在primary方法前执行
    @Before("execution(* com.example.demo.controller.UserController.primary(..))")
    public void setDataSource2test01() {
        System.err.println("Primary业务");
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.primary);
    }

    //在secondary方法前执行
    @Before("execution(* com.example.demo.controller.UserController.secondary(..))")
    public void setDataSource2test02() {
        System.err.println("Secondary业务");
        DataSourceType.setDataBaseType(DataSourceType.DataBaseType.secondary);
    }
}
