package thread.threadLocal;

import java.util.ArrayList;

/**
 * @author zhouson
 * @create 2021-04-24 16:28
 */
public class Utils {

    private final static ThreadLocal<Integer> count = new ThreadLocal<>();

    private int i;

    public static ThreadLocal<Integer> getCount() {

        return count;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static void sum() {
        count.set(count.get()+1);
    }
}
