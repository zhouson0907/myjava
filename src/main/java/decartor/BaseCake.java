package decartor;

/**
 * @author zhouson
 * @create 2021-05-08 12:14
 */
public class BaseCake implements Cake {



    @Override
    public void getCake() {
        System.out.println("手抓饼");
    }

    @Override
    public double getPrice() {
        return 5;
    }
}
