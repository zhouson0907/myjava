package io;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * @author zhouson
 * @create 2019-06-02 22:27
 */
public class IoDemo02 {
    public static void main(String[] args) throws IOException {
/*   byte[] bytes=new byte[1024];//每次读取的有效字节,并将其存储在缓冲区数组中
        int len=0;//表示读取到的有效字节个数，即read方法的返回值
        while ((len=fis.read(bytes))!=-1){
            System.out.println(new String(bytes));
        }*/
        FileInputStream fis = new FileInputStream("C:\\Users\\dell\\Desktop\\a.txt");
//        byte[] b = new byte[1024];
//        int len = 0;
//        while((len=fis.read(b))!=-1) {
//            System.out.println(new String(b));
//        }
        System.out.println(fis.read());

    }
}
