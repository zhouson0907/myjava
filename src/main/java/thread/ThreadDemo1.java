package thread;

/**
 * @author zhouson
 * @create 2019-05-12 11:35
 */
//第二种创建多线程的方法
public class ThreadDemo1 implements Runnable {
    @Override
    public void run() {
        //currentThread():获取当前正在执行的线程对象的引用。
        //getName():返回该线程的名称
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
        String s = Thread.currentThread().getName();
        System.out.println(s);
    }

    public static void main(String[] args) {
        ThreadDemo1 td = new ThreadDemo1();
        Thread t1 = new Thread(td);
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
//        new Thread(td).start();
//        new Thread(td).start();
//        new Thread(td).start();

    }
}
