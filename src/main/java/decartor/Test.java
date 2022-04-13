package decartor;

/**
 * @author zhouson
 * @create 2021-05-08 12:19
 */
public class Test {
    public static void main(String[] args) {
        //普通手抓饼
        Cake cake1 = new BaseCake();
        cake1.getCake();
        //手抓饼+鸡蛋
        Cake cake2 = new BaseCake();
        Decorator d1 = new AddEggCake(cake2);
        d1.getCake();

        //手抓饼+ 2个鸡蛋 + 一根肠
        Decorator d2 =  new AddSusageCake(new AddEggCake(new AddEggCake(new BaseCake())));
        d2.getCake();
        System.out.println(d2.getPrice());
    }
}
