package com.example.springmybatis2.controller;

import com.example.springmybatis2.domain.Users;
import com.example.springmybatis2.service.IRefuseQueue;
import com.example.springmybatis2.service.IUsersService;
import com.example.springmybatis2.utils.JacksonUtil;
import com.example.testapi.domain.RefuseQueue;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/11/15
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @Autowired
    private IUsersService usersServiceImpl;

    @Autowired
    private IRefuseQueue refuseQueue;

    @RequestMapping("/info")
    private String index(){

        List<Users> usersList = usersServiceImpl.getAllUsers();

        Map<String,Object> map = new HashMap<String, Object>(16);
        if (usersList.size()>0){
            for (Users users: usersList){
                Map<String,Object> stringMap = new HashMap<String, Object>(10);
                String name = users.getUsername();
                stringMap.put("name",name);
                String birthDay = users.getBirthday().toString();
                stringMap.put("birthDay",birthDay);
                String email = users.getEmail();
                stringMap.put("email",email);
                map.put("users", JacksonUtil.mapToJson(stringMap));
                map.put("okokoko", JacksonUtil.mapToJson(stringMap));
            }
        }

        String resultJson = JacksonUtil.mapToJson(map);
        return resultJson;
    }

    @RequestMapping("/refuseQueue")
    private List<RefuseQueue> index(HttpServletRequest request,@RequestParam("date") String date){
        return refuseQueue.getListByDate(date);
    }
}
