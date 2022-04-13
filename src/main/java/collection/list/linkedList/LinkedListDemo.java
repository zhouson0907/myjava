package collection.list.linkedList;

/**
 * @author zhouson
 * @create 2019-05-01 23:11
 */

import java.util.LinkedList;

/**
 *  LinkedList
 *  1.实现原理，采用双向链表结构实现（所以查询慢，增删快）
 *  2.适合插入、删除操作，性能高
 *  3.包含了大量操作收尾元素的方法
 *  注意：使用LinkedList集合特有的方法，不能使用多态。
 */
public class LinkedListDemo {
    public static void main(String[] args) {
     show();
    }
    private static void show(){
        LinkedList<String> lists = new LinkedList<>();
        lists.add("a");
        lists.add("b");
        lists.add("c");
        lists.add("d");
        //将制定元素插入到集合列表的开头，等效于push方法
        lists.addFirst("0");
        //将制定元素插入到集合列表的末尾，等效于add方法
        lists.addLast("e");
        //获取第一个元素
        lists.getFirst();
        //获取最后一个元素
        lists.getLast();
        String s = lists.get(0);
        System.out.println(s);
        //移除第一个元素（等效于pop方法）
        lists.removeFirst();
        //移除最后一个元素
        lists.removeLast();
    }
}
