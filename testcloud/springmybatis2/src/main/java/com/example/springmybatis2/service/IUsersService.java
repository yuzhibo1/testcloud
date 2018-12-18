package com.example.springmybatis2.service;


import com.example.springmybatis2.domain.Users;

import java.util.List;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
public interface IUsersService {
    List<Users> getAllUsers();
}
