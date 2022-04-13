package string;

import org.junit.jupiter.api.Test;

/**
 * @author zhouson
 * @create 2019-04-27 15:47
 */
public class stringDemo {

    @Test
    public void test() {
        String s = "#我是熊猫#我是熊猫";
        //第一种（不推荐）CharSequence意思是说可以接受字符串类型
        CharSequence charSequence = s.subSequence(1, 5);
        System.out.println(charSequence);
        //第二种
        String s1 = s.substring(1, 5);
        System.out.println(s1);
        String s2="a";
        String s3="b";
        //如果一个是常量，一个是变量
        System.out.println("a".equals(s2));//推荐
        System.out.println(s2.equals("a"));//不推荐，因为如果s2为空值，会保空指针异常
        s2.equals(s3);
        //比较时忽略大小写
        s2.equalsIgnoreCase("A");
        s2.length();
        //拼接
        String concat = s2.concat(s3);
        System.out.println(concat);
        //查找

        char c = s2.charAt(0);
        System.out.println(c);
        //查出索引
        int i = s.indexOf("熊猫");
        System.out.println(i);
        //转换为char数组
        char[] chars = s.toCharArray();
        //转换为bate数组
        byte[] bytes = s.getBytes();
        //替换
        String replace = s.replace("#", "!");
        System.out.println(replace);
        //分割字符串
        String s4="aaa,bbb,ccc";
        //注意，split方法的参数其实是一个"正则表达式"
        String[] split = s4.split(",");
        for (int i1 = 0; i1 < split.length; i1++) {
            System.out.println(split[i1]);
           
        }
    }
}
