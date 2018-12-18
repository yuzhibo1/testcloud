package com.example.springcustomer3.controller;

import com.example.springcustomer3.service.HelloService;
import com.example.springcustomer3.service.HelloService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName(类名) : TestController
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/13
 */
@RestController
public class TestController {
    @Autowired
    HelloService2 helloService2;

    @RequestMapping(value = "/feign-customer1")
    public String helloCustomer() {

        return helloService2.hello();

    }
}
