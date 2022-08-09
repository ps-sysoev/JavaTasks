package classes.zoo;

import org.junit.Assert;
import org.junit.Test;

public class ZooServiceTest {
    private final Zoo[] zoos = {
            new Zoo("Zoo-1", 50.00, new Animal[]{
                    new Animal("Hippopotamus-1", 15),
                    new Animal("Lion", 5),
                    new Animal("Elephant", 21),
                    new Animal("Hippopotamus-2", 5),
                    new Animal("Tiger", 7),
            }),
            new Zoo("Zoo-2", 100.00, new Animal[]{
                    new Animal("Hippopotamus-1", 15),
                    new Animal("Lion", 5),
                    new Animal("Elephant", 21),
                    new Animal("Hippopotamus-2", 5),
                    new Animal("Tiger", 7),
                    new Animal("Tiger-2", 12),
            }),
            new Zoo("Zoo-3", 56.31, new Animal[]{
                    new Animal("Hippopotamus-1", 15),
                    new Animal("Lion", 5),
                    new Animal("Elephant-1", 21),
                    new Animal("Elephant-2", 19),
                    new Animal("Elephant-3", 10),
                    new Animal("Hippopotamus-2", 5),
                    new Animal("Tiger", 7),
            }),
            new Zoo("Zoo-4", 70.55, new Animal[]{
                    new Animal("Hippopotamus-1", 15),
                    new Animal("Lion-1", 10),
                    new Animal("Lion-2", 1),
                    new Animal("Lion-3", 9),
                    new Animal("Lion-4", 7),
                    new Animal("Lion-5", 8),
                    new Animal("Lion-6", 1),
                    new Animal("Elephant", 21),
                    new Animal("Hippopotamus-2", 5),
                    new Animal("Tiger", 7),
            }),
            new Zoo("Zoo-5", 45.70, new Animal[]{
                    new Animal("Hippopotamus-1", 15),
                    new Animal("Lion", 5),
                    new Animal("Elephant", 21),
                    new Animal("Hippopotamus-2", 5),
                    new Animal("Tiger", 7),
                    new Animal("Crocodile-1", 6),
                    new Animal("Crocodile-2", 22),
                    new Animal("Crocodile-3", 17),
            })
    };

    @Test
    public void firstTestOfCalculatingAverageCost() {
        double expected = 64.51;
        double result = ZooService.getAverageTicketPrice(zoos);

        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void secondTestOfCalculatingAverageCost() {
        double expected = 0.00;
        double result = ZooService.getAverageTicketPrice(new Zoo[0]);

        Assert.assertEquals(expected, result, 0.01);
    }


    @Test
    public void thirdTestOfCalculatingAverageCost() {
        double expected = 0.00;
        double result = ZooService.getAverageTicketPrice(new Zoo[1]);

        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void fourthTestOfCalculatingAverageCost() {
        double expected = 0.00;
        double result = ZooService.getAverageTicketPrice(null);

        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void firstTestGetBiggestZoo() {
        String expected = "Zoo-4";
        String result = ZooService.getBiggestZoo(zoos);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void secondTestGetBiggestZoo() {
        String expected = "";
        String result = ZooService.getBiggestZoo(null);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void thirdTestGetBiggestZoo() {
        String expected = "";
        String result = ZooService.getBiggestZoo(new Zoo[0]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fourthTestGetBiggestZoo() {
        String expected = "";
        String result = ZooService.getBiggestZoo(new Zoo[1]);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void fifthTestGetBiggestZoo() {
        Zoo[] testZoos = {
                new Zoo("Zoo-1", 65.00, new Animal[]{
                        new Animal("Hippopotamus", 25),
                        new Animal("Lion", 15),
                        new Animal("Elephant", 35)
                }),
                new Zoo("Zoo-2", 70.00, new Animal[]{
                        new Animal("Hippopotamus-1", 15),
                        new Animal("Hippopotamus-2", 5),
                        new Animal("Tiger", 7)})
        };

        String expected = "Zoo-1";
        String result = ZooService.getBiggestZoo(testZoos);

        Assert.assertEquals(expected, result);
    }
}