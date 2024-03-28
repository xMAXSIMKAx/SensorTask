public class WeightObserver implements Observer {
    public void update(int temperature) {
        int weight = 1 + (temperature < 0 ? 2 * Math.abs(temperature) : 0);
        System.out.println("Weight: " + weight + " g");
    }
}
