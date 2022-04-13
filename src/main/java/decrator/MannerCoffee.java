package decrator;

/**
 * @author zhouson
 * @create 2021-12-11 20:52
 */
public class MannerCoffee extends Coffee{
    public MannerCoffee() {
        desc = "MannerCoffee";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
