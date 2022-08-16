package polymorphism;

public class Mazda extends Auto {
    private final String model;
    private final String engineType;

    public Mazda(String model, String engineType) {
        this.model = model;
        this.engineType = engineType;
    }

    public String getModel() {
        return model;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
