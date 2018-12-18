package com.example.springmybatis2.domain;

/**
 * @ClassName(类名) : Main
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/14
 */
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.naming.NamingException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, NamingException {

        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        Person person = applicationContext.getBean(Person.class);
        person.setHungry(0);
        person.setName("admin");
        person.isNeedEat();
    }
}