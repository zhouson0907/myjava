package thread;

/**
 * @author zhouson
 * @create 2019-05-12 11:35
 */
public class ThreadDemo extends Thread{
    @Override
    public void run() {
        //currentThread():获取当前正在执行的线程对象的引用。
        //getName():返回该线程的名称
        String s = Thread.currentThread().getName();
        System.out.println(s);
        //setName():设置线程名称（了解）
//        Thread.currentThread().setName("");

        try {
            Thread.sleep(1000);//使当前正在执行的线程以指定的时间执行（暂时停止执行）
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadDemo td=new ThreadDemo();
        ThreadDemo td2=new ThreadDemo();
        td.start();
        td2.start();
    }
}
