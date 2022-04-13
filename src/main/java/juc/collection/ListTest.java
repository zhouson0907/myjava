package juc.collection;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author zhouson
 * @create 2022-04-13 19:51
 */
public class ListTest {
    @Test
    public void test() throws InterruptedException {
        // 会报ConcurrentModificationException，产生并发问题
        // List<String> list = new ArrayList<>();
        List<String> list = new CopyOnWriteArrayList<>();
        // set 底层就是CopyOnWriteArrayList
        Set<String> set = new CopyOnWriteArraySet<>();
        for (int i = 0; i < 30; i++) {
            new Thread(() -> {
                for (int j = 0; j < 30; j++) {
                    list.add(UUID.randomUUID().toString().substring(0,8));
                }
                System.out.println(list);
            }).start();
        }
        Thread.sleep(3000);
    }
}
