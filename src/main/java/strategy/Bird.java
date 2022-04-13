package strategy;

import org.junit.jupiter.api.Test;

/**
 * @author zhouson
 * @create 2021-12-11 21:06
 */
public class Bird {
     String feather;
     String mouth;
     FlyHabit flyHabit;
     RunHabit runHabit;

    public void setFlyHabit(FlyHabit flyHabit) {
        this.flyHabit = flyHabit;
    }

    public void setRunHabit(RunHabit runHabit) {
        this.runHabit = runHabit;
    }

    public void running() {
        runHabit.run();
    }

    public void flying() {
        flyHabit.flyHabit();
    }

    @Test
    public void test() {
        Bird bird = new Sparrow();
        bird.running();
    }
}
