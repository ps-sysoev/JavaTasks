package polymorphism;

public class Main {
    public static void main(String[] args) {
        Auto[] autos = {
                new Kia("Kia-1", "Dizel"),
                new Mazda("Mazda-1", "Petrol"),
                new Toyota("Toyota-1", "Diezel"),
                new Mazda("Mazda-2", "Petrol"),
                new Kia("Kia-2", "Gaz"),
                new Toyota("Toyota-2", "Petrol"),
                new Kia("Kia-3", "Petrol"),
                new Toyota("Toyota-3", "Hybrid"),
                new Mazda("Mazda-3", "Gaz")
        };

        for (Auto auto : autos) {
            System.out.println(auto.getEngineType());
        }
    }
}
