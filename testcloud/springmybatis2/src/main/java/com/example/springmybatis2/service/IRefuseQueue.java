package com.example.springmybatis2.service;

import com.example.testapi.domain.RefuseQueue;

import java.util.List;

/**
 * @ClassName(类名) : IRefuseQueue
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2019/2/1
 */
public interface IRefuseQueue {
    List<RefuseQueue> getListByDate(String date);
}
