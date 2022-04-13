package decrator;

/**
 * @author zhouson
 * @create 2021-12-11 20:54
 */
public class GoCoffee extends Coffee{
    public GoCoffee() {
        desc = "GoCoffee";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
