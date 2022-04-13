package decartor;

/**
 * @author zhouson
 * @create 2021-05-08 12:17
 */
public class AddSusageCake extends Decorator {


    public AddSusageCake(Cake cake) {
        super(cake);
    }
    @Override
    public void getCake() {
        System.out.println("加香肠");
    }

    @Override
    public double getPrice() {
        return super.cake.getPrice()+3;
    }
}
