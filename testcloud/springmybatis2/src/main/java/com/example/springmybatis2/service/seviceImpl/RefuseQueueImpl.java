package com.example.springmybatis2.service.seviceImpl;

import com.example.springmybatis2.dao.RefuseQueueMapper;
import com.example.springmybatis2.service.IRefuseQueue;
import com.example.testapi.domain.RefuseQueue;
import com.example.testapi.domain.RefuseQueueCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName(类名) : RefuseQueueImpl
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2019/2/1
 */
@Service
public class RefuseQueueImpl implements IRefuseQueue{
    @Autowired
    private RefuseQueueMapper refuseQueueMapper;

    @Override
    public List<RefuseQueue> getListByDate(String date) {
        RefuseQueueCriteria criteria = new RefuseQueueCriteria();
        RefuseQueueCriteria.Criteria refuseQueueCriteria = criteria.createCriteria();
        refuseQueueCriteria.andApplDtEqualTo(date);
        List<RefuseQueue> list = refuseQueueMapper.selectByExample(criteria);
        return list;
    }
}
