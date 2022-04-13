import org.junit.jupiter.api.Test;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * @author zhouson
 * @create 2022-04-11 19:44
 */
public class Test2 {
    private  volatile Integer number = 0;
    private  volatile Boolean state = false;
    public void updateState() {
        this.state = true;
        this.number = 60;
        System.out.println("修改成功");
    }
    public static void main(String[] args) {
    }

    @Test
    public void test () {
        AtomicInteger atomicInteger = new AtomicInteger();
        Test2 t = new Test2();
        new Thread(() -> {
            try {
                Thread.sleep(5);
                t.updateState();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        while (t.number == 0 && !t.state) {
        }
        System.out.println(t.number +"\t" +t.state);
        System.out.println("主线程通过");
    }

    @Test
    public void test1() {
        User user = new User("zhangsan", 25);
        AtomicStampedReference<User> s = new AtomicStampedReference(user, 1);
        boolean lisi = s.compareAndSet(user, new User("lisi", 24), 1, 2);
        System.out.println(lisi);
        CopyOnWriteArrayList copy = new CopyOnWriteArrayList();
        CopyOnWriteArraySet<Integer> copy1 = new CopyOnWriteArraySet();
}
}
class User {
    private String username;
    private int age;

    public User(String username, int age) {
        this.username = username;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
