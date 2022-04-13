package decrator;

/**
 * @author zhouson
 * @create 2021-12-11 20:58
 */
public class Apple extends Decrator{
    private Coffee coffee;

    public Apple(Coffee coffee) {
        this.coffee = coffee;
    }
    @Override
    public double cost() {
        return coffee.cost() + .2;
    }

    @Override
    public String getDesc() {
        return coffee.getDesc() + " add apple";
    }
}
