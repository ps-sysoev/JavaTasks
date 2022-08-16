package polymorphism;

public class Kia extends Auto {
    private final String model;
    private final String engineType;

    public Kia(String model, String engineType) {
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
        return "Kia{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
