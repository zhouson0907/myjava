package decrator;

import org.junit.jupiter.api.Test;

/**
 * @author zhouson
 * @create 2021-12-11 20:50
 */
public abstract class Coffee {
    String desc = "unknown coffee";

    public String getDesc() {
        return desc;
    }

    public abstract double cost();

    static class Test {
        @org.junit.jupiter.api.Test
        public void test() {
            Coffee c = new Milk(new Apple(new MannerCoffee()));
            System.out.println(" 点了："+c.getDesc());
            System.out.println(" 花费："+c.cost()+"元");
        }
    }
}
