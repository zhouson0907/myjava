package thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author zhouson
 * @create 2019-05-27 21:12
 */
public class ThreadDemo6 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"执行了一个任务");
    }

    public static void main(String[] args) {
        //使用线程池的工厂类Executors里边提供的静态方法newFixedThreadPool声场一个指定线程数量的线程池
        ExecutorService es=Executors.newFixedThreadPool(2);
        //开启线程，执行run方法
        es.submit(new ThreadDemo6());
        es.submit(new ThreadDemo6());
        es.submit(new ThreadDemo6());
        //销毁线程池（不建议使用）
        //es.shutdown();


    }
}
