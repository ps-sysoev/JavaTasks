package csv;

import org.junit.Test;

import static org.junit.Assert.*;

public class CsvFormatterTest {
    @Test
    public void whenCsvTextEmpty() {
        CsvFormatter csvFormatter = new CsvFormatter();
        String csvText = "";

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> csvFormatter.getPersonsFromCsvFile(csvText));

        assertEquals("Incorrect parameter: csvString not be null or empty.", thrown.getMessage());
    }

    @Test
    public void whenCsvTextNull() {
        CsvFormatter csvFormatter = new CsvFormatter();
        String csvText = null;

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class, () -> csvFormatter.getPersonsFromCsvFile(csvText));

        assertEquals("Incorrect parameter: csvString not be null or empty.", thrown.getMessage());
    }

    @Test
    public void whenMoreThanTwoParameters() {
        String testString = "name=Ivan,lastname=Ivanov,age=35;" +
                "name=Petr,lastname=Petrov;" +
                "name=Fedor,lastname=Sidorov;";

        Person[] expected = {
                new Person("Petr", "Petrov"),
                new Person("Fedor", "Sidorov")
        };

        CsvFormatter csvFormatter = new CsvFormatter();

        Person[] result = csvFormatter.getPersonsFromCsvFile(testString);

        assertArrayEquals(expected, result);
    }

    @Test
    public void whenLessThanTwoParameters() {
        String testString = "name=Ivan,lastname=Ivanov;" +
                "name=Petr;" +
                "name=Fedor,lastname=Sidorov;";

        Person[] expected = {
                new Person("Ivan", "Ivanov"),
                new Person("Fedor", "Sidorov")
        };

        CsvFormatter csvFormatter = new CsvFormatter();

        Person[] result = csvFormatter.getPersonsFromCsvFile(testString);

        assertArrayEquals(expected, result);
    }

    @Test
    public void personsFromCsvFileTest() {
        String testString = "name=Ivan,lastname=Ivanov;" +
                "name=Petr,lastname=Petrov;" +
                "name=Fedor,lastname=Sidorov;";

        Person[] expected = {
                new Person("Ivan", "Ivanov"),
                new Person("Petr", "Petrov"),
                new Person("Fedor", "Sidorov")
        };

        CsvFormatter csvFormatter = new CsvFormatter();

        Person[] result = csvFormatter.getPersonsFromCsvFile(testString);

        assertArrayEquals(expected, result);
    }
}