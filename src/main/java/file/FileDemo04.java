package file;

import java.io.File;

/**
 * @author zhouson
 * @create 2019-05-28 21:13
 */
public class FileDemo04 {
    public static void main(String[] args) {
        //遍历目录
        File f1=new File("D:\\BaiduYunDownload\\Game\\Game");
        String[] list = f1.list();
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------");
        //遍历目录且会将路径也打印出来
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file);
        }
    }
}
