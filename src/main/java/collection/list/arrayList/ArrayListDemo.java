package collection.list.arrayList;

/**
 * @author zhouson
 * @create 2019-05-01 22:55
 */

import java.util.ArrayList;
import java.util.List;

/**
 *ArrayList（底层是一个数组，所以查询快，增删慢）
 *   1.实现原理，采用动态对象数组实现，默认够造方法构建了一个空数组
 *   2.第一次添加元素，扩展容量为10，之后的扩充算法：原来数组大小+原来数组的一半
 *   3.动态数组不适合进行删除或插入操作，会导致位置变动
 *   4.为了防止数组动态扩充次数过多，建议创建ArrayList时，给定初始容量
 *   5.线程不安全，适合在单线程访问时使用
 */
public class ArrayListDemo {
    public static void main(String[] args) {

    }
}
