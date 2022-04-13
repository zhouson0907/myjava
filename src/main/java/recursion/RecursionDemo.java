package recursion;

/**
 * @author zhouson
 * @create 2019-05-28 21:20
 */

/**
 * 递归注意事项：执行次数不能太多
 *              构造方法，不能递归
 *              要有条件限制，否则栈内存溢出
 * 递归使用前提：调用方法的时候，方法的主体不变，每次调用方法的参数不同，
 * 可以使用递归。
 * 递归：方法自己调用自己，分为直接递归（直接在方法自己里面调用）
 * 和间接递归（有一个中间方法，比如在b方法中调用c方法，然后再再c方法中调用b方法）。
 *
 */
public class RecursionDemo {

    public  static int a(int n){
        if (n==0){
            return 1;
        }
            return n*a(n-1);
    }
    public static void main(String[] args) {
        int a = a(3);
        System.out.println(a);
    }
}
