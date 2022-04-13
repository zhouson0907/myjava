package observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * @author zhouson
 * @create 2021-12-11 21:37
 */
public class TemperatureComponent {
    double temperature;
    private List<MyObserver> registers;

    public TemperatureComponent() {
        registers = new ArrayList<>();
    }

    public void register(MyObserver myObserver) {
        if(myObserver != null) {
            registers.add(myObserver);
        }
    }

    public void remove(MyObserver myObserver) {
        int i = registers.indexOf(myObserver);
        if(i >= 0) {
            registers.remove(i);
        }
    }

    public void executeChange() {
        for (int i = 0; i < registers.size(); i++) {
            registers.get(i).update(temperature);
        }
    }

    public void change(double temperature) {
        this.temperature = temperature;
        executeChange();
    }

    public static void main(String[] args) {
        TemperatureComponent t = new TemperatureComponent();
        WeatherConcrete weather = new WeatherConcrete(t);
        t.change(35.5);
    }
}
