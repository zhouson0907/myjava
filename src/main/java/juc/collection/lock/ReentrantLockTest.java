package juc.collection.lock;

import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 自旋锁demo
 * 自旋锁（synchronized、reentrantLock）
 * 表示一个在一个同步资源里面调用别的锁资源会自动获得锁(会在一开始就获得，不是去访问的时候去获得，下面线程t3在t1线程去等待调用set的时候，
 * 去抢占锁，是没抢过的，说明线程t1在一开始就获得了锁)
 *
 * @author zhouson
 * @create 2022-04-13 20:06
 */
public class ReentrantLockTest {
    Lock lock = new ReentrantLock();
    public void get() throws InterruptedException {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke get()");
            Thread.sleep(2000);
            set();
        } finally {
            lock.unlock();
        }
    }

    public void set() throws InterruptedException {
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t invoke set()");
        } finally {
            lock.unlock();
        }
    }

    @Test
    public void test() throws Exception {
        new Thread(() -> {
            try {
                get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t1").start();
        new Thread(() -> {
            try {
                set();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t3").start();
        new Thread(() -> {
            try {
                get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"t2").start();
        Thread.sleep(5000);
    }
}
