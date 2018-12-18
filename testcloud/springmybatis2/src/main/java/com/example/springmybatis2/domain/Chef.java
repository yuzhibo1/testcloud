package com.example.springmybatis2.domain;

/**
 * @ClassName(类名) : Chef
 * @Description(描述) : TODO
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/14
 */
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 厨师类用于对饥饿事件的监听...
 *
 * @author chen.nie
 * @date 2018/4/26
 **/
@Component
public class Chef implements ApplicationListener<HungryEvent> {
    @Override
    public void onApplicationEvent(HungryEvent event) {
        if (event.getSource() instanceof Person) {

            Person person = (Person) event.getSource();
            System.out.println(person.getName() + "饿了,开始做饭");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("做饭完毕....开始吃吧");
        }
    }
}