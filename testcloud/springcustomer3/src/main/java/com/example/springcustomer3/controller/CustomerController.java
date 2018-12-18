package com.example.springcustomer3.controller;

import com.example.springcustomer3.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
@RestController
public class CustomerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-customer")
    public String helloCustomer() {

        return helloService.hello();

    }
}
