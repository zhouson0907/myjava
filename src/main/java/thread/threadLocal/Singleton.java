package thread.threadLocal;

/**
 * @author zhouson
 * @create 2021-04-24 17:13
 */

public class Singleton {
    private static Singleton instance;

    private static int i;

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        Singleton.i = i;
    }

    private Singleton (){}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

