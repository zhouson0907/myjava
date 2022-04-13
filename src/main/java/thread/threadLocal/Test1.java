package thread.threadLocal;

import org.junit.jupiter.api.Test;

/**
 * @author zhouson
 * @create 2021-04-24 17:14
 */
public class Test1 {
    @Test
    public void test() {
        new Thread(() ->{
            Singleton instance = Singleton.getInstance();
            System.out.println("第一个线程"+instance);
            instance.setI(1);
            for (int i = 0; i < 5; i++) {
                System.out.println("第一个线程"+instance.getI());
            }
        }).start();

        new Thread(() ->{
            Singleton instance = Singleton.getInstance();
            System.out.println("第二个线程"+instance);
            instance.setI(2);
            for (int i = 0; i < 5; i++) {
                System.out.println("第二个线程"+instance.getI());
            }
        }).start();
    }
}
