package com.example.springmybatis2.dao;

import com.example.springmybatis2.domain.Users;
import com.example.springmybatis2.domain.UsersCriteria;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
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