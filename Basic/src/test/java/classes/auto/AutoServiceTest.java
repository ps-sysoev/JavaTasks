package classes.auto;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AutoServiceTest {
    private final List<Auto> autos = new ArrayList<>(List.of(
            new Auto("BMW X5", "BMW", 5, "AT"),
            new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
            new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
            new Auto("Lexus RX330", "Lexus", 5, "AT"),
            new Auto("Toyota Land Cruiser 200", "Toyota", 5, "AT"),
            new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
            new Auto("Nissan Skyline X", "Nissan", 2, "MT"),
            new Auto("BMW X4 30d II", "BMW", 5, "AT"),
            new Auto("Nissan X-Trail III", "Nissan", 5, "MT")
    ));

    @Test
    public void firstTestGetSpecificCarModel() {
        String model = "Mercedes-E";

        List<Auto> expected = new ArrayList<>(List.of(
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT")
        ));
        List<Auto> result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void secondTestGetSpecificCarModel() {
        String model = "";

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void thirdTestGetSpecificCarModel() {
        String model = "";
        List<Auto> tempAutos = new ArrayList<>(1);

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(model, tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fourthTestGetSpecificCarModel() {
        String model = "BMW";
        List<Auto> tempAutos = new ArrayList<>(1);

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(model, tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fifthTestGetSpecificCarModel() {
        String model = "default";

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(model, autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void sixTestGetSpecificCarModel() {
        String model = "BMW";

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(model, null);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void sevenTestGetSpecificCarModel() {
        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(null, autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void eightTestGetSpecificCarModel() {
        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSpecificCarModel(null, null);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void firstTestGetSportCars() {
        List<Auto> expected = new ArrayList<>(List.of(
                new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
                new Auto("Nissan Skyline X", "Nissan", 2, "MT")
        ));

        List<Auto> result = AutoService.getSportCars(autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void secondTestGetSportCars() {
        List<Auto> tempAutos = new ArrayList<>(List.of(
                new Auto("BMW X5", "BMW", 5, "AT"),
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
                new Auto("Lexus RX330", "Lexus", 5, "AT")
        ));

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void thirdTestGetSportCars() {
        List<Auto> tempAutos = List.of();

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fourthTestGetSportCars() {
        List<Auto> tempAutos = new ArrayList<>(1);

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSportCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fifthTestGetSportCars() {
        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSportCars(null);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void firstTestGetOnlyAutomaticTypeCars() {
        List<Auto> expected = new ArrayList<>(List.of(
                new Auto("BMW X5", "BMW", 5, "AT"),
                new Auto("Mercedes-E 300 IV", "Mercedes", 4, "AT"),
                new Auto("Mercedes-E 400 IV", "Mercedes", 5, "AT"),
                new Auto("Lexus RX330", "Lexus", 5, "AT"),
                new Auto("Toyota Land Cruiser 200", "Toyota", 5, "AT"),
                new Auto("Porsche 911 Turbo S", "Porsche", 2, "AT"),
                new Auto("BMW X4 30d II", "BMW", 5, "AT")
        ));

        List<Auto> result = AutoService.getOnlyAutomaticTypeCars(autos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void secondTestGetOnlyAutomaticTypeCars() {
        List<Auto> tempAutos = new ArrayList<>(List.of(
                new Auto("Nissan Skyline X", "Nissan", 2, "MT"),
                new Auto("Nissan X-Trail III", "Nissan", 5, "MT")
        ));

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void thirdTestGetOnlyAutomaticTypeCars() {
        List<Auto> tempAutos = List.of();

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fourthTestGetOnlyAutomaticTypeCars() {
        List<Auto> tempAutos = new ArrayList<>(1);

        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getOnlyAutomaticTypeCars(tempAutos);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }

    @Test
    public void fifthTestGetOnlyAutomaticTypeCars() {
        List<Auto> expected = List.of();
        List<Auto> result = AutoService.getSportCars(null);

        Assert.assertArrayEquals(expected.toArray(), result.toArray());
    }
}