package strategy;

/**
 * @author zhouson
 * @create 2021-12-11 21:12
 */
public class Sparrow extends Bird implements RunHabit,FlyHabit{

    public Sparrow() {
        runHabit = new RocketRun();
    }


    @Override
    public void run() {
        runHabit.run();
    }

    @Override
    public void flyHabit() {

    }


}
