package thread;

/**
 * @author zhouson
 * @create 2019-05-26 21:10
 */
public class ThreadDemo3 implements Runnable {
    private  int ticket=100;
        @Override
        public  void run() {
            //currentThread():获取当前正在执行的线程对象的引用。
            //getName():返回该线程的名称
            while (true) {
               payTicket();
            }
        }
        public synchronized void payTicket(){
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() +" "+ticket + "号票已出售");
            }
            ticket--;
        }

    public static void main(String[] args) {
        ThreadDemo3 td = new ThreadDemo3();
        new Thread(td).start();
        new Thread(td).start();
        new Thread(td).start();
    }
}
