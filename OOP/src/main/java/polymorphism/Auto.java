package polymorphism;

public class Auto {
    private String engineType;

    public Auto() {
    }

    public Auto(String engineType) {
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "engineType='" + engineType + '\'' +
                '}';
    }
}
