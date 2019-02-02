package com.example.springcustomer3.controller;

import com.example.springcustomer3.service.HelloService;
import com.example.springcustomer3.service.HelloService2;
import com.example.testapi.domain.RefuseQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName(类名) : TestController
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/13
 */
@Controller
public class TestController {
    @Autowired
    private HelloService2 helloService2;

    @RequestMapping(value = "/feign-customer1")
    public String helloCustomer() {
        return helloService2.hello();
    }

    @RequestMapping(value = "/feign-customer1-refuse")
    @ResponseBody
    public Object helloRefuse() {
        List<RefuseQueue> list1 = helloService2.index("2017-01-01");
        List<RefuseQueue> list2 = helloService2.index("2017-01-02");
        List<RefuseQueue> list3 = helloService2.index("2017-01-03");
        List<RefuseQueue> list4 = helloService2.index("2017-01-04");
        List<RefuseQueue> list5 = helloService2.index("2017-01-05");
        List<RefuseQueue> list6 = helloService2.index("2017-01-06");
        List<RefuseQueue> list7 = helloService2.index("2017-01-07");
        List names = new ArrayList<>();
        names.add("2017-01-01") ;
        names.add("2017-01-02") ;
        names.add("2017-01-03") ;
        names.add("2017-01-04") ;
        names.add("2017-01-05") ;
        names.add("2017-01-06") ;
        names.add("2017-01-07") ;
        List values = new ArrayList<>();
        values.add(list1.size());
        values.add(list2.size());
        values.add(list3.size());
        values.add(list4.size());
        values.add(list5.size());
        values.add(list6.size());
        values.add(list7.size());


        Map resultMap = new HashMap<>(16);
        resultMap.put("names",names);
        resultMap.put("values",values);
        return resultMap;
    }

    @RequestMapping(value = "/test")
    public String testController() {
        return "/test";
    }
}
