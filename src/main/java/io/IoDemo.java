package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

/**
 * @author zhouson
 * @create 2019-06-02 21:51
 */
public class IoDemo {
    public static void main(String[] args) throws Exception{
        //true则将字节写入文件末尾处，而不是写入文件开始处
        FileOutputStream fos=new FileOutputStream("C:\\Users\\dell\\Desktop\\a.txt",true);
//        byte[] bytes={97,98,99,100,101};
//        fos.write(97);
//        fos.write(bytes);
        String s="abcdefg";
        byte[] bytes = s.getBytes();
        fos.write(bytes);
        fos.close();
    }
}
