package collection.hash;

/**
 * @author zhouson
 * @create 2019-05-01 23:33
 */

/**
 * 哈希值：是一个十进制的正数，由系统随机给出（就是对象的地址值，是一个
 * 逻辑地址，不是数据实际存储的物理地址）
 * 是一个本地方法：代表该方法调用的是本地操作系统的方法
 * String重写了hashCode的方法
 */
public class HashDemo {
    public static void main(String[] args) {
        HashDemo h1=new HashDemo();
        int i = h1.hashCode();
        System.out.println(i);
    }
}
