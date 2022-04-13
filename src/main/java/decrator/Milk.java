package decrator;

/**
 * @author zhouson
 * @create 2021-12-11 20:57
 */
public class Milk extends Decrator{
    private Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " add milk";
    }
}
