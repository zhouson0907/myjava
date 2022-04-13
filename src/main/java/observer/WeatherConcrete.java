package observer;

/**
 * @author zhouson
 * @create 2021-12-11 21:42
 */
public class WeatherConcrete implements MyObserver, Weather{
    private double temperature;
    private TemperatureComponent temperatureComponent;

    public WeatherConcrete(TemperatureComponent temperatureComponent) {
        this.temperatureComponent = temperatureComponent;
        temperatureComponent.register(this);
    };

    public void update(double temperature) {
        this.temperature = temperature;
        display();
    }

    @Override
    public void display() {
        System.out.println("温度" + temperature);
    }
}
