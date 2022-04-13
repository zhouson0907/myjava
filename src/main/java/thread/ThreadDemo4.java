package thread;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author zhouson
 * @create 2019-05-26 21:10
 */
public class ThreadDemo4 implements Runnable {
    private int ticket = 100;
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        //currentThread():获取当前正在执行的线程对象的引用。
        //getName():返回该线程的名称
        while (true) {
            l.lock();
            try {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + " " + ticket + "号票已出售");
                    ticket--;
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                l.unlock();
            }
        }
    }


    public static void main(String[] args) {
        ThreadDemo4 td = new ThreadDemo4();
        new Thread(td).start();
        new Thread(td).start();
        new Thread(td).start();
    }
}
