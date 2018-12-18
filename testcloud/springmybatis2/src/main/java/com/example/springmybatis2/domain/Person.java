package com.example.springmybatis2.domain;

/**
 * @ClassName(类名) : Person
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/14
 */
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * Person类，如果属性hungry的值为0，则通知厨师做饭吃。
 */
@Component
public class Person implements ApplicationEventPublisherAware {

    private int hungry;

    private String name;

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void isNeedEat() {
        if (this.hungry == 0) {
            System.out.println("太饿了,需要吃东西");

            //对饥饿时间进行发布，发布后所有监听此事件的监听者会触发事件处理onApplicationEvent()方法执行相关操作
            new Thread(() -> this.applicationEventPublisher.publishEvent(new HungryEvent(this))).start();
            System.out.println("通知完毕");
        }
    }


}
