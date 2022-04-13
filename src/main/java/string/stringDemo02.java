package string;

import org.junit.jupiter.api.Test;

/**
 * @author zhouson
 * @create 2019-04-27 15:47
 */
public class stringDemo02 {
    @Test
    public void test() {
     //String常用三种创建方式
        String s=new String();
        byte[] b={97,98,99};
        char[] c={'a','b','c'};
        String s1=new String(b);
        String s2=new String(c);
        System.out.println(s1);
        System.out.println(s2);
    }
}
