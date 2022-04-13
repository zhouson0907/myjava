package file;

import java.io.File;

/**
 * @author zhouson
 * @create 2019-05-27 22:35
 */
public class FileDemo {
    public static void main(String[] args) {
        File f1=new File("b.txt");
//        System.out.println(f1);
        File f2=new File("c:\\c.txt");
//        System.out.println(f2);
        File f3=new File("c:\\","d.txt");
//        System.out.println(f3);
        //获取绝对路径
        String ap = f3.getAbsolutePath();
        String ap1 = f1.getAbsolutePath();
        System.out.println(ap1);
        System.out.println(ap);
        //将此file转换为路径名字字符串
        String path = f3.getPath();
        System.out.println(path);
        //得到file表示的文件或目录的名称
        String name = f3.getName();
        System.out.println(name);
        //返回file表示的文件的大小
        long length = f3.length();
        System.out.println(length);
    }
}
