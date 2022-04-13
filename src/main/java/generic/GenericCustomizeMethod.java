package generic;

/**
 * @author zhouson
 * @create 2019-05-01 20:37
 */

public class GenericCustomizeMethod {
    //定义含有泛型的方法
   public <E> void method01(E e){
       System.out.println(e);
   }
   //定义一个含有泛型的静态方法
    public static <E> void method02(E e){
        System.out.println(e);
    }
}
