package scanner;

import java.util.Scanner;

/**
 * @author zhouson
 * @create 2019-04-27 18:23
 */
public class ScannerDemo {

    public static void main(String[] args) {
        int i;
        String s;
        do{
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入您的账号");
         s = sc.next();
        System.out.println("请输入您的密码");
         i = sc.nextInt();
       /*  if(!s.equals("user") || i!=123){
             System.out.println("账号或密码输入错误，请重新输入!!!");
         }*/
            if(s.equals("user") && i==123) {
                System.out.println("登录成功");
            }else {
                System.out.println("账号或密码输入错误，请重新输入!!!");
            }
        }while (!s.equals("user") || i!=123);
    }
}
