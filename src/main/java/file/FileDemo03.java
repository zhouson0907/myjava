package file;

import java.io.File;
import java.io.IOException;

/**
 * @author zhouson
 * @create 2019-05-28 20:55
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File f1=new File("d:/aaa","a.txt");
        File f2=new File("d:/aaa");
        //创建文件夹（单级），不能创建文件---多级文件夹（mkdirs()方法）
        boolean mkdir = f2.mkdir();
        System.out.println(mkdir);
        try {
            //创建成功（只能创建文件，不能创建文件夹），返回true
            boolean newFile = f1.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //可以删除文件或文件夹
        f1.delete();
    }
}
