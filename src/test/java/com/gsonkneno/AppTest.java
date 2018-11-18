package com.gsonkneno;

import com.gsonkneno.annotation.Configuration;
import com.gsonkneno.bean.BlackPeople;
import org.junit.Test;

import java.lang.annotation.Annotation;


public class AppTest {

    @Test
    public void test(){
        //获取类上的注解
        Annotation[] annotations = BlackPeople.class.getAnnotations();

        for (Annotation annotation: annotations) {
            System.out.println(annotation);
            //如果属于Configuration注解的实例，获取注解上的值
            if (annotation instanceof Configuration){
                System.out.println(((Configuration)annotation).value());
            }
        }
    }

}
