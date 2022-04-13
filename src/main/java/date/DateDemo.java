package date;

import java.util.Date;

/**
 * @author zhouson
 * @create 2019-04-29 20:56
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        Date date1 = new Date(1000000);//将毫秒值转换为日期
        long time = date.getTime();
        date.setTime(1000000);
        System.out.println(time);
        System.out.println(date);
        System.out.println(date1);
    }
}
