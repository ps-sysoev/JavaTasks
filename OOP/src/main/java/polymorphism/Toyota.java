package polymorphism;

public class Toyota extends Auto {
    private final String model;
    private final String engineType;

    public Toyota(String model, String engineType) {
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
        return "Toyota{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
