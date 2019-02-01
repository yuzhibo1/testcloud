package com.example.springmybatis.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
@FeignClient(value = "producer3", fallback = HelloServiceFallback.class)  //用于通知Feign组件对该接口进行代理(不需要编写接口实现)， producer3代理的具体服务
public interface HelloService {
    @RequestMapping("/info") //对应具体服务中的接口地址（具体服务controller 层的暴露接口）可以指定具体的get/post
    String hello();
}

