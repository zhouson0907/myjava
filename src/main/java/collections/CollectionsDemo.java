package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author zhouson
 * @create 2019-05-02 0:18
 */
/*
    - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
           - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list，Comparator<? super T> ):将集合中元素按照指定规则排序。

     Comparator和Comparable的区别
        Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个

    Comparator的排序规则:
        o1-o2:升序
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<String> lists=new ArrayList<>();
        //打乱顺序
        Collections.shuffle(lists);
        //添加多个元素
        Collections.addAll(lists,"b","a","c","d");
        //排序(只能对list集合使用)
        Collections.sort(lists);
        System.out.println(lists);
        ArrayList<Person> lists02=new ArrayList<>();
        Collections.addAll(lists02,new Person("小",12),new Person("大",14),
        new Person("中",13));
        Collections.sort(lists02, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(lists02);
    }
}
