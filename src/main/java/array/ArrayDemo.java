package array;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;


/**
 * @author zhouson
 * @create 2019-04-27 17:05
 */
public class ArrayDemo {
    @Test
    public void test() {
        byte[] b = new byte[10];
        b[0] = 20;
        String[] s = {"a", "b", "c", "d", "e"};
        //正向排序
        Arrays.sort(s);
        //反向排序(先正向排序)
        for (int i = s.length - 1; i >= 0; i--) {
            System.out.println(s[i]);
        }
        System.out.println(Array.get(b, 0));
        System.out.println(Arrays.toString(s));
        List<String> strings = Arrays.asList(s);
        System.out.println(strings);
        for (String s1 : strings) {
            System.out.print(s1 + " ");
        }
        int i = Arrays.binarySearch(s, 0, 2, "b");
        System.out.println(i);
        Arrays.fill(s, 0, 2, "变身");
        System.out.println(Arrays.toString(s));
    }
}
