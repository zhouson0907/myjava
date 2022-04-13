package file;

import java.io.File;

/**
 * @author zhouson
 * @create 2019-05-28 20:46
 */
public class FileDemo02 {
    public static void main(String[] args) {
        File f1=new File("C:/","a.txt");
        System.out.println(f1);
        //判断文件（路径）是否存在
        System.out.println(f1.exists());
        //判断是否以文件夹结尾
        System.out.println(f1.isDirectory());
        //判断是否以文件结尾（在盘读研文件存在的情况下，和isDirectory方法互斥）
        System.out.println(f1.isFile());
    }
}
