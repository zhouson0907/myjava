package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouson
 * @create 2019-04-29 21:11
 */
public class DateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Date date=new Date();
        String s = sdf.format(date);
        System.out.println(s);
        //解析文本，将其返回到原始格式，而且输入的字符串格式和SimpleDateFormat里面的pattern的格式要一致
        Date parse = sdf.parse("2019-12-29 09:17:47");
        System.out.println(parse);
    }
}
