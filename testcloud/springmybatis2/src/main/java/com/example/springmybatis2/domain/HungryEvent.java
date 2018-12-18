package com.example.springmybatis2.domain;

/**
 * @ClassName(类名) : HungryEvent
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/14
 */
import org.springframework.context.ApplicationEvent;

/**
 * 定义一个描饥饿状态的事件
 *
 * @author chen.nie
 * @date 2018/4/26
 **/
public class HungryEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public HungryEvent(Object source) {
        super(source);
    }
}
