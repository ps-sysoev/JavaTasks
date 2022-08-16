package classes.auto;

import org.junit.Assert;
import org.junit.Test;

public class AutoServiceTest {
    private final Auto[] autos = {
            new Auto("BMW X5", "BMW", 5, "AT"),
            new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
            new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
            new Auto("Lexus RX330", "Lexus", 5, "AT"),
            new Auto("Toyota Land Cruiser 200", "Toyota", 5, "AT"),
            new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
            new Auto("Nissan Skyline X", "Nissan", 2, "MT"),
            new Auto("BMW X4 30d II", "BMW", 5, "AT"),
            new Auto("Nissan X-Trail III", "Nissan", 5, "MT")
    };

    @Test
    public void firstTestGetSpecificCarModel() {
        String model = "Mercedes-E";

        Auto[] expected = {
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT")
        };
        Auto[] result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void secondTestGetSpecificCarModel() {
        String model = "";

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void thirdTestGetSpecificCarModel() {
        String model = "";
        Auto[] tempAutos = new Auto[0];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(model, tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fourthTestGetSpecificCarModel() {
        String model = "BMW";
        Auto[] tempAutos = new Auto[1];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(model, tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fifthTestGetSpecificCarModel() {
        String model = "default";

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void sixTestGetSpecificCarModel() {
        String model = "BMW";

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(model, null);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void sevenTestGetSpecificCarModel() {
        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(null, autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void eightTestGetSpecificCarModel() {
        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSpecificCarModel(null, null);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstTestGetSportCars() {
        Auto[] expected = {
                new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
                new Auto("Nissan Skyline X", "Nissan", 2, "MT"),
        };
        Auto[] result = AutoService.getSportCars(autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void secondTestGetSportCars() {
        Auto[] tempAutos = {
                new Auto("BMW X5", "BMW", 5, "AT"),
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
                new Auto("Lexus RX330", "Lexus", 5, "AT"),
        };

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void thirdTestGetSportCars() {
        Auto[] tempAutos = new Auto[0];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fourthTestGetSportCars() {
        Auto[] tempAutos = new Auto[1];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fifthTestGetSportCars() {
        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSportCars(null);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void firstTestGetOnlyAutomaticTypeCars() {
        Auto[] expected = {
                new Auto("BMW X5", "BMW", 5, "AT"),
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
                new Auto("Lexus RX330", "Lexus", 5, "AT"),
                new Auto("Toyota Land Cruiser 200", "Toyota", 5, "AT"),
                new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
                new Auto("BMW X4 30d II", "BMW", 5, "AT")
        };
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(autos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void secondTestGetOnlyAutomaticTypeCars() {
        Auto[] tempAutos = {
                new Auto("Nissan Skyline X", "Nissan", 2, "MT"),
                new Auto("Nissan X-Trail III", "Nissan", 5, "MT")
        };

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void thirdTestGetOnlyAutomaticTypeCars() {
        Auto[] tempAutos = new Auto[0];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fourthTestGetOnlyAutomaticTypeCars() {
        Auto[] tempAutos = new Auto[1];

        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void fifthTestGetOnlyAutomaticTypeCars() {
        Auto[] expected = new Auto[0];
        Auto[] result = AutoService.getSportCars(null);

        Assert.assertArrayEquals(expected, result);
    }
}