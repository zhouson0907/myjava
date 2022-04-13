package collection.set.hashSet;

/**
 * @author zhouson
 * @create 2019-05-01 23:30
 * <p>
 * 解决hashSet中的重复值使用的方式时，参考第6点
 * HashSet类：1.类实现Set接口，由哈希表（实际上是一个HashMap实例）支持。
 * 2.不允许重复，可以有一个NUll元素
 * 3.不保证顺序恒久不变
 * 4.添加元素时把元素作为HashMap的key存储，HashMap的value使用一个固定的object对象
 * 5.排除重复元素是通过equals来检查对象是否相同。
 * 6.判断对象是否相同：先判断2个对象的hashCode是否相同（相同，不一定是同一个对象，不同，一定不是同一个对象）
 * 相同，继续判断equals判断，equals相同，则一定是同一个对象，反之则不是。
 * 7.自定义对象要认为属性值都相同时为同一个对象，这种需求时，我们要重写对象所在类的hashCode和equals方法。
 * 8.底层是一个哈希表结构（查询的速度非常的快）
 */

/**
 * 解决hashSet中的重复值使用的方式时，参考第6点
 * HashSet类：1.类实现Set接口，由哈希表（实际上是一个HashMap实例）支持。
 *            2.不允许重复，可以有一个NUll元素
 *            3.不保证顺序恒久不变
 *            4.添加元素时把元素作为HashMap的key存储，HashMao的value使用一个固定的object对象
 *            5.排除重复元素是通过equals来检查对象是否相同。
 *            6.判断对象是否相同：先判断2个对象的hashCode是否相同（相同，不一定是同一个对象，不同，一定不是同一个对象）
 *  相同，继续判断equals判断，equals相同，则一定是同一个对象，反之则不是。
 *            7.自定义对象要认为属性值都相同时为同一个对象，这种需求时，我们要重写对象所在类的hashCode和equals方法。
 *            8.底层是一个哈希表结构（查询的速度非常的快）
 */

import java.util.HashSet;
import java.util.Set;

/**
 * 如果用Set存储自定义类型元素的时候，必须要重写equals和hashcode方法，否则
 * 起不到不能存储相同元素的目的
 */
public class HashSetDemo {
    public static void main(String[] args) {
        Set<Person> s = new HashSet<>();
        Person p1 = new Person("小", 12);
        Person p2 = new Person("小", 12);
        Person p3 = new Person("小", 13);
        s.add(p1);
        s.add(p2);
        s.add(p3);
        System.out.println(s);
    }
}
