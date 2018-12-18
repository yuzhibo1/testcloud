package com.example.springmybatis2;

/**
 * @ClassName(类名) : ExecutorServiceTest
 * @Description(描述) : 多线程学习
 * @author(作者) : yubo
 * @date (开发日期)      : 2018/12/13
 */
import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.*;
import java.util.concurrent.*;

public class ExecutorServiceTest {
    public static void main(String[] args) {
        ThreadFactory namedThreadFactory = new ThreadFactoryBuilder().build();
        ExecutorService executorService = new ThreadPoolExecutor(5, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());
        //List<Future<String>> resultList = new ArrayList<Future<String>>();
        List<Integer> resultFailMap = new LinkedList<Integer>();
        List<Integer> resultSuccessMap = new LinkedList<Integer>();

        // 创建10个任务并执行
        for (int i = 0; i < 10; i++) {
            Future<String> future;
            // 使用ExecutorService执行Callable类型的任务，并将结果保存在future变量中
            if (i%2 == 0){
                future = executorService.submit(new TaskWithResult(new TaskTestOne("tom")));
            }else {
                future = executorService.submit(new TaskWithResult(new TaskTestOne("cat")));
            }
            try {
                // 打印各个线程（任务）执行的结果
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                //e.printStackTrace();
                resultSuccessMap.add(i);
                continue;
            }
            resultFailMap.add(i);
        }
        executorService.shutdown();

        for (Integer failVal:resultFailMap){
            System.out.println(failVal);
        }
        System.out.println("------------------");
        for (Integer successVal:resultSuccessMap){
            System.out.println(successVal);
        }
    }
}

class TaskWithResult implements Callable<String> {
    private TaskTestOne objectEntity;

    public TaskWithResult(Object object) {
        this.objectEntity = (TaskTestOne) object;
    }

    /**
     * 任务的具体过程，一旦任务传给ExecutorService的submit方法，则该方法自动在一个线程上执行。
     *
     * @return
     * @throws Exception
     */
    public String call() throws Exception {
        System.out.println("call()方法被自动调用,干活！！！             " + Thread.currentThread().getName());
        if (new Random().nextBoolean())
            throw new TaskException("Meet error in task." + Thread.currentThread().getName());
        // 一个模拟耗时的操作
        for (int i = 999999999; i > 0; i--)
            ;
        return "call()方法被自动调用，任务的结果是：" + objectEntity.getName() + "    " + Thread.currentThread().getName();
    }
}

class TaskException extends Exception {
    public TaskException(String message) {
        super(message);
    }
}

class TaskTestOne{
    private String name;

    public TaskTestOne(String nameStr){
        this.name = nameStr;
    }

    public String getName(){
        return this.name;
    }
}
class TaskTestTwo{
    public void getName(){
        System.out.println("hello! TaskTestTwo!");
    }
}