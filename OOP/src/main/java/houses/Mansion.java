package houses;

public class Mansion extends House {
    private final Foundation foundation;
    private Resident[] residents;

    public Mansion(Foundation foundation) {
        this.foundation = foundation;
    }

    public Foundation getFoundation() {
        return foundation;
    }

    public Resident[] getResidents() {
        return residents;
    }

    public void setResidents(Resident[] residents) {
        this.residents = residents;
    }
}
