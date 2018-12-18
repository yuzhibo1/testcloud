package com.example.springmybatis.service.seviceImpl;

import com.example.springmybatis.dateUtil.DateUtil;
import com.example.springmybatis.service.IInsuranceService;

import java.util.*;

/**
 * @ClassName(类名) : InsuranceServiceImpl
 * @Description(描述) : 阳光保险操作类
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/17
 */
public class InsuranceServiceImpl implements IInsuranceService{

    @Override
    public void doOperation(Map<String, Object> map) {
        //首先进行xmlhead的组建
        ResourceBundle resource = ResourceBundle.getBundle("config/insurance");
        Map<String,String> xmlHeadMap = new HashMap<String, String>(16);
        //系统标识
        String sysFlag =resource.getString("SysFlag");
        xmlHeadMap.put("sysFlag",sysFlag);
        //用户名
        String sendName = resource.getString("SendName");
        xmlHeadMap.put("sendName",sendName);
        //用户密码
        String sendPwd = resource.getString("SendPwd");
        xmlHeadMap.put("sendPwd",sendPwd);
        //交易码
        String transCode = resource.getString("TransCode");
        xmlHeadMap.put("transCode",transCode);
        //请求序列号UUID
        String sendSeq = UUID.randomUUID().toString();
        xmlHeadMap.put("sendSeq",sendSeq);
        //请求发送时间2016-05-27 19:46:31
        String sendTime = DateUtil.getDateTimeFormat(new Date());
        xmlHeadMap.put("sendTime",sendTime);
        //保单条数
        String policyCount = "1";
        xmlHeadMap.put("policyCount",policyCount);
        //操作类型
        String operateType = "input_pay";
        xmlHeadMap.put("operateType",operateType);
        //1 TB表，2 短险表
        String modeFlag = "1";
        xmlHeadMap.put("modeFlag",modeFlag);





    }
}
