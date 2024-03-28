public class Main {
    public static void main(String[] args) {
        Substance substance = new Substance();

        // Додамо спостерігачів
        substance.addObserver(new WeightObserver());
        substance.addObserver(new ColorObserver());

        // Змінимо температуру та спостерігаємо результат
        System.out.println("При температурі 0 градусів");
        substance.setTemperature(0);
        System.out.println("при температурі 10 градусів");
        substance.setTemperature(10);
        System.out.println("при температурі 5 градусів");
        substance.setTemperature(5);
    }
}
