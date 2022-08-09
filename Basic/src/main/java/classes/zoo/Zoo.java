package classes.zoo;

import java.util.Arrays;

public class Zoo {
    private String name;
    private double ticketPrice;
    Animal[] animals;

    public Zoo(String name, double ticketPrice, Animal[] animals) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: name is empty");
        }

        if (ticketPrice <= 0.00) {
            throw new IllegalArgumentException("Incorrect parameter: ticketPrice <= 0.00");
        }

        if (animals == null) {
            throw new IllegalArgumentException("Incorrect parameter: animals = null");
        }

        this.name = name;
        this.ticketPrice = ticketPrice;
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: name is empty");
        }

        this.name = name;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        if (ticketPrice <= 0.00) {
            throw new IllegalArgumentException("Incorrect parameter: ticketPrice <= 0.00");
        }

        this.ticketPrice = ticketPrice;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Incorrect parameter: animals = null");
        }

        this.animals = animals;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", ticketPrice=" + ticketPrice +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}