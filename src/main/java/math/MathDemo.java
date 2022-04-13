package math;

/**
 * @author zhouson
 * @create 2019-04-29 0:13
 */
public class MathDemo {
    public static void main(String[] args) {
        //向下取整
        System.out.println(Math.floor(5.2));
        //向上取整
        System.out.println(Math.ceil(5.2));
        //获得绝对值
        System.out.println(Math.abs(-2.5));
        System.out.println(Math.abs(2.5));
        //四舍五入
        System.out.println(Math.round(5.5));
        System.out.println(Math.round(5.6));
        System.out.println(Math.PI);
      //小学数学题(计算在-10.8-5.9之间，绝对值大于6或小于2.1的有多少个)
        int min = (int) Math.ceil(-10.8);
        int count=0;
        int max=5;
        System.out.print("得出的值"+" ");
        for(int i=min;i<=max;i++){
            int abs = Math.abs(i);
            if(abs>6||abs<2.1){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("所得总数："+count);
    }
}
