package designModel.decorator;

/**
 * @author zhouson
 * @create 2021-07-05 9:04
 */
public class Test {
    public static void main(String[] args) {
        Decaf d = new Decaf();
        Milk m = new Milk(new Chocolate(d));
        System.out.println(m.cost());
        System.out.println(m.description);
    }
}
