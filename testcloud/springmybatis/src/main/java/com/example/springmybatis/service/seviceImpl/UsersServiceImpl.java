package com.example.springmybatis.service.seviceImpl;

import com.example.springmybatis.dao.UsersDao;
import com.example.springmybatis.domain.Users;
import com.example.springmybatis.domain.UsersCriteria;
import com.example.springmybatis.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @ClassName(类名) : MatchString
 * @Description(描述) : TODO
 * @author(作者) ：lenovo
 * @date (开发日期)      ：2018/12/12
 */
@Component
public class UsersServiceImpl implements IUsersService{

    @Autowired
    private UsersDao usersDao;
    @Override
    public List<Users> getAllUsers(){
        UsersCriteria criteria = new UsersCriteria();
        UsersCriteria.Criteria entityCriteria = criteria.createCriteria();
        entityCriteria.andIdIsNotNull();
        List<Users> usersList = usersDao.selectByExample(criteria);
        return usersList;
    }
}
