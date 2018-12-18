package com.example.springmybatis.dao;

import com.example.springmybatis.domain.Users;
import com.example.springmybatis.domain.UsersCriteria;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UsersDao {
    long countByExample(UsersCriteria example);

    int deleteByExample(UsersCriteria example);

    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersCriteria example);

    Users selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersCriteria example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}