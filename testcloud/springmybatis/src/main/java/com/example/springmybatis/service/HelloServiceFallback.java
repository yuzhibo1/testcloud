package com.example.springmybatis.service;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
public class HelloServiceFallback implements HelloService {
    @Override
    public String hello() {
        return "request error";
    }
}
