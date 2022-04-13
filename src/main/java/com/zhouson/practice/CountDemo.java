package com.zhouson.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author zhouson
 * @create 2019-05-02 1:39
 */
public class CountDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("等待输入。。。。。。");
        String s = sc.next();
        Map<Character,Integer> m=new HashMap<>();
        int count=0;
        char[] chars = s.toCharArray();
        //当遍历key的时候，如果存在，就不改变key，直接将value++，
        // 这样就会将之前的value覆盖，起到统计的效果，
        //如果不存在，直接将其作为新的key存进去，此时value为1（因为是第一次存储）
        for (char c : chars) {
            if(m.containsKey(c)){
                Integer value = m.get(c);
                value++;
                m.put(c,value);
            }else {
                m.put(c,1);
            }
        }
        for(char key:m.keySet()){
            Integer value = m.get(key);
            System.out.print(key+":"+value+" ");
        }
    }
}
