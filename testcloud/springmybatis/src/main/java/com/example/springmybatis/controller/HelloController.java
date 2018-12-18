package com.example.springmybatis.controller;

import com.example.springmybatis.domain.Users;
import com.example.springmybatis.service.IUsersService;
import com.example.springmybatis.utils.JacksonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
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

    @RequestMapping("/info")
    public String index(){

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
                map.put("users",JacksonUtil.mapToJson(stringMap));
            }
        }

        String resultJson = JacksonUtil.mapToJson(map);
        return resultJson;
    }
}
