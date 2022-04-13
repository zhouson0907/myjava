package collection.mapper;

import java.util.HashMap;
import java.util.Iterator;
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
public class MapperDemo {
    public static void main(String[] args) {
        //key不能重复，重复会覆盖之前的值，value可以重复
        Map<String, String> m = new HashMap<>();
        m.put("01", "小一");
        m.put("02", "小二");
        m.put("03", "小三");
        m.put("04", "小四");
        m.put("05", "小五");
        m.put("06", "小五");
        String remove = m.remove("01");
        String s = m.get("02");
        System.out.println(s);
        m.containsKey("03");
        boolean b = m.containsValue("小五");
        //遍历（第一种）
        Set<String> strings = m.keySet();
        for (String s3 : strings) {
            String s1 = m.get(s3);
            System.out.print(s3+"="+s1+" ");

        }
        System.out.println();
        //iterator
        Iterator<String> iterator = strings.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            String value = m.get(key);
            System.out.print(key+":"+value+" ");
        }
        System.out.println();
        //第二种遍历
        Set<Map.Entry<String, String>> entries = m.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> next = iterator1.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.print(key+":"+value+" ");
        }
        System.out.println();
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.print(key+":"+value+" ");
        }
    }

}
