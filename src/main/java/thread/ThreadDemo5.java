package thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhouson
 * @create 2019-05-26 21:10
 */
public class ThreadDemo5 implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
       /* wait()等待
        notify()唤醒
        这2个方法都是属于object类的方法；因为锁可以是任意对象（继承object类）
        这2个方法必须要在同步代码块或者同步函数中使用。（必须通过同一个锁对象调用这2个方法）

        */
        //currentThread():获取当前正在执行的线程对象的引用。
        //getName():返回该线程的名称
        while (true) {
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " " + ticket + "号票已出售");
                    ticket--;
                    this.wait();//线程等待
                    //this.wait(5000);//等待5秒，自动唤醒
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                this.notify();//唤醒单个线程
                this.notifyAll();//唤醒多个线程
            }
        }
    }


    public static void main(String[] args) {
        ThreadDemo5 td = new ThreadDemo5();
        new Thread(td).start();
        new Thread(td).start();
        new Thread(td).start();
    }
}
