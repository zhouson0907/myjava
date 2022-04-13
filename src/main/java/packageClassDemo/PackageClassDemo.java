package packageClassDemo;

/**
 * @author zhouson
 * @create 2019-04-29 22:17
 */
public class PackageClassDemo {
    public static void main(String[] args) {
        //装箱
        Integer integer=new Integer(1);
        Integer integer1 = Integer.valueOf(1);
        //拆箱
        int i = integer.intValue();
        System.out.println(integer1);
        //自动装箱（jdk1.5之后）
        Integer in=1;//相当于 Integer integer=new Integer(1);
       /* 自动拆箱（jdk1.5之后）,in是包装类，无法直接参与运算，可以自动转换
        为基本数据类型，在进行计算in+2，相当于Integer.valueOf(1)+2
        而in=in.value()+2又是一个自动装箱*/
        in=in+2;
        //基本数据类型转换为字符串类型
        //第一种,基本数据类型的值加上一个字符串（空的），比如
        String s=i+"";
        //第二种,用包装类的toString方法
        String s1 = integer.toString();
        //第三种，用String类的静态方法valueOf方法
        String s2 = String.valueOf(i);
        //字符串类型转换为基本数据类型(包装类的parseXXX方法)
        int s11 = Integer.parseInt("s1");
    }
}

