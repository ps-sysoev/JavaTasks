package classes.auto;

import java.util.Objects;

public class Auto {
    private String model;
    private String mark;
    private int numberOfPassengerSeats;
    private String transmissionType;

    public Auto(String model, String mark, int numberOfPassengerSeats, String transmissionType) {
        if (model == null || model.isEmpty() || model.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: model is empty");
        }

        if (mark == null || mark.isEmpty() || mark.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: mark is empty");
        }

        if (numberOfPassengerSeats <= 0) {
            throw new IllegalArgumentException("Incorrect parameter: numberOfPassengerSeats is empty");
        }

        if (transmissionType == null || transmissionType.isEmpty() || transmissionType.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: transmissionType is empty");
        }

        this.model = model;
        this.mark = mark;
        this.numberOfPassengerSeats = numberOfPassengerSeats;
        this.transmissionType = transmissionType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: model is empty");
        }

        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        if (mark == null || mark.isEmpty() || mark.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: mark is empty");
        }

        this.mark = mark;
    }

    public int getNumberOfPassengerSeats() {
        return numberOfPassengerSeats;
    }

    public void setNumberOfPassengerSeats(int numberOfPassengerSeats) {
        if (numberOfPassengerSeats <= 0) {
            throw new IllegalArgumentException("Incorrect parameter: numberOfPassengerSeats is empty");
        }

        this.numberOfPassengerSeats = numberOfPassengerSeats;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        if (transmissionType == null || transmissionType.isEmpty() || transmissionType.equals(" ")) {
            throw new IllegalArgumentException("Incorrect parameter: transmissionType is empty");
        }

        this.transmissionType = transmissionType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Auto auto = (Auto) o;

        return numberOfPassengerSeats == auto.numberOfPassengerSeats
                && model.equals(auto.model)
                && mark.equals(auto.mark)
                && transmissionType.equals(auto.transmissionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, mark, numberOfPassengerSeats, transmissionType);
    }

    @Override
    public String toString() {
        return "Auto{" +
                "model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", numberOfPassengerSeats=" + numberOfPassengerSeats +
                ", transmissionType='" + transmissionType + '\'' +
                '}';
    }
}