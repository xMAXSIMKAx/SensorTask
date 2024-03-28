import java.util.ArrayList;
import java.util.List;

public class Substance {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(int temperature) {
        int tempChange = temperature - this.temperature;
        this.temperature = temperature;
        notifyObservers(tempChange);
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    private void notifyObservers(int temperatureChange) {
        for (Observer observer : observers) {
            observer.update(temperatureChange);
        }
    }
}
