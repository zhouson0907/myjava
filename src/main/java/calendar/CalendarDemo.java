package calendar;

import java.util.Calendar;
import java.util.Date;


/**
 * @author zhouson
 * @create 2019-04-29 21:25
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        //给一个日历字段，返回给定日历字段的值
        int date = instance.get(Calendar.DAY_OF_MONTH);
//        instance.setTime(new Date());
//        System.out.println(instance);
        //设置指定的字段的值
        instance.set(Calendar.YEAR, 9999);
        //同时设置年月日
        instance.set(9999, 11, 20);
        System.out.println(date);
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
        int month = instance.get(Calendar.MONTH);
        System.out.println(month + 1);//西方月是0-11，东方1-12
        //给指定的字段增加（正数）或减少（负数）的值
        instance.add(Calendar.YEAR,3);
        //把日历对象转换为日期对象
        Date time = instance.getTime();
        System.out.println(time);
    }
}
