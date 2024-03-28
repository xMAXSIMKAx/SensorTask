public class ColorObserver implements Observer {
    @Override
    public void update(int temperature) {
        String color = (temperature <= 0) ? "White" : "Black";
        System.out.println("Color: " + color);
    }
}

