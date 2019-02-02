package com.example.springmybatis2.dao;

import com.example.testapi.domain.RefuseQueue;
import com.example.testapi.domain.RefuseQueueCriteria;
import com.example.testapi.domain.RefuseQueueKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface RefuseQueueMapper {
    long countByExample(RefuseQueueCriteria example);

    int deleteByExample(RefuseQueueCriteria example);

    int deleteByPrimaryKey(RefuseQueueKey key);

    int insert(RefuseQueue record);

    int insertSelective(RefuseQueue record);

    List<RefuseQueue> selectByExample(RefuseQueueCriteria example);

    RefuseQueue selectByPrimaryKey(RefuseQueueKey key);

    int updateByExampleSelective(@Param("record") RefuseQueue record, @Param("example") RefuseQueueCriteria example);

    int updateByExample(@Param("record") RefuseQueue record, @Param("example") RefuseQueueCriteria example);

    int updateByPrimaryKeySelective(RefuseQueue record);

    int updateByPrimaryKey(RefuseQueue record);
}