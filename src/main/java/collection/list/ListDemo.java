package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhouson
 * @create 2019-05-01 22:44
 */
/**
 * List(有序，且允许存储重复元素，有索引)
 * 面试题：ArrayList与Vector的区别
 *
 *
 *Vector
 *1.实现原理：采用动态对象数组实现，默认构造方法创建了一个大小为10的独享数组
 *2.扩充的算法：当增量为0时，扩充为原来大小的2倍，当增量大于0时，扩充为原来大小+增量
 *3.不适合删除或插入操作
 *4.为了防止数组动态扩充次数过多，建议创建Vector时，给定初始容量
 *5.线程安全，适合在多线程访问时使用，效率较低
 *
 *
 */
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.get(0);
//        list.remove(0);
        list.set(0,"b");
        System.out.println(list);
    }
}
