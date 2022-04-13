package stringBuilder;

/**
 * @author zhouson
 * @create 2019-04-29 22:04
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder("abc");
        //可以写返回值，也可以不写
        StringBuilder def = sb1.append("def");
        System.out.println(sb1);
        System.out.println(sb1==def);//表示是同一对象，同一个值
        //转换为String对象
        String s = sb1.toString();
    }
}
