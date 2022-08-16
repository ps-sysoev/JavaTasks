package houses;

public class Foundation {
    private final String type;

    public Foundation(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Foundation{" +
                "type='" + type + '\'' +
                '}';
    }
}
