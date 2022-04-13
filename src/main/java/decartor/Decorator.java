package decartor;

/**
 * @author zhouson
 * @create 2021-05-08 12:29
 */
public abstract class Decorator implements Cake{

    protected Cake cake;

    private double price1 = 0;

    public double getPrice1() {
        return price1;
    }

    public void setPrice1(double price) {
        this.price1 = price;
    }

    public Decorator(Cake cake) {
        this.cake = cake;
    }

    @Override
    public void getCake() {
        cake.getCake();
    }

    @Override
    public double getPrice() {
        setPrice1(cake.getPrice());
        return getPrice1();
    }
}
