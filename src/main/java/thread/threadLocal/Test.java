package thread.threadLocal;

/**
 * @author zhouson
 * @create 2021-04-24 16:31
 */
public class Test {

    public static void main(String[] args) {
        new Thread(() -> {
            ThreadLocal<Integer> count = Utils.getCount();
            Utils u =  new Utils();
            count.set(0);
            for (int i = 0; i < 5; i++) {
                Utils.sum();
                System.out.println("第一个线程count的值" + count.get());
                u.setI(u.getI()+1);
                System.out.println("第一个线程i的值" + count.get());
            }
            System.out.println("执行完成后i的值"+ u.getI());
            count.remove();
        }).start();

        new Thread(() -> {
            ThreadLocal<Integer> count = Utils.getCount();
            Utils.getCount().set(0);
            for (int i = 0; i < 5; i++) {
                Utils.sum();
                Utils u = new Utils();
                u.setI(u.getI()+1);
                System.out.println("第二个线程的值" + Utils.getCount().get());
                System.out.println("第二个线程i的值" + Utils.getCount().get());
            }
            count.remove();
        }).start();
    }

}
