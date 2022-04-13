package collection.mapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhouson
 * @create 2019-05-02 0:55
 */
/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合,一个元素包含两个值(一个key,一个value)
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同
        3.Map集合中的元素,key是不允许重复的,value是可以重复的
        4.Map集合中的元素,key和value是一一对应
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表|红黑树(链表的长度超过8):提高查询的速度
        2.hashMap集合是一个无序的集合,存储元素和取出元素的顺序有可能不一致
   java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
   LinkedHashMap的特点:
        1.LinkedHashMap集合底层是哈希表+链表(保证迭代的顺序)
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class MapperDemo02 {
    public static void main(String[] args) {
        //key不能重复，重复会覆盖之前的值，value可以重复
        Map<String, Person> m = new HashMap<>();
        m.put("上海",new Person("小一",12));
        m.put("武汉",new Person("小二",15));
        m.put("深圳",new Person("小四",12));
        m.put("北京",new Person("小三",18));
        Set<String> keys = m.keySet();
        for (String key : keys) {
            Person value = m.get(key);
            System.out.println(key+":"+value);
        }
    }
}
