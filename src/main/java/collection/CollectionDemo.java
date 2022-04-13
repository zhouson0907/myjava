package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author zhouson
 * @create 2019-04-29 22:50
 */
public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> c = new ArrayList<String>();
        //添加
        c.add("张三");
        c.add("李四");
        c.add("王五");
        c.add("老六");
        //清空集合元素
//        c.clear();
        //移除指定元素
//        c.remove("张三");
        //判断是否包含
//        for(String s:c){
//            System.out.print(s+" ");
//        }
        boolean b = c.contains("张三");
        //判断是否为空
        boolean empty = c.isEmpty();
        //返回集合中元素的个数
        int size = c.size();
        //把集合中的元素，存储到数组中
        Object[] objects = c.toArray();
        for(Object o:objects){
            System.out.print(o+" ");
        }
        System.out.println();
        System.out.println("================");
        //遍历（用iterator）
        Iterator<String> iterator = c.iterator();
        /*for(int i=0;i<size;i++) {
            if (iterator.hasNext()) {
                String next = iterator.next();
                System.out.print(next+" ");
            }
        }*/
        System.out.println();
        System.out.println("================");
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.print(next+" ");
        }
    }
}
