package random;

import java.util.Random;
import java.util.Scanner;


/**
 * @author zhouson
 * @create 2019-04-28 21:37
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        int i = r.nextInt(100);
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("请输入");
            int i1 = sc.nextInt();
            count++;
            if (i1 < i) {
                System.out.println("输入的值小了，请重新输入");
            }else{
                if (i1 > i) {
                    System.out.println("输入的值太大了，请重新输入");
                }
                else {
                    System.out.println("恭喜你，猜对了");
                    System.out.println("你总共猜了"+count+"次");
                    if(count<5){
                        System.out.println("你就是传说中的天选之人吗");
                    }else{
                        if(count<10){
                            System.out.println("运气不错，小伙子");
                        }else{
                            System.out.println("你就是传说中的衰老吗");
                        }
                    }
                    break;
                }
            }
        } while (true);
    }
}



