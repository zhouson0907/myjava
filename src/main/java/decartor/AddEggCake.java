package decartor;

/**
 * @author zhouson
 * @create 2021-05-08 12:15
 */
public class AddEggCake extends Decorator {


    public AddEggCake(Cake cake) {
        super(cake);
    }

    @Override
    public void getCake() {
        System.out.println("加鸡蛋");
    }

    @Override
    public double getPrice() {
        return super.cake.getPrice()+2;
    }
}
