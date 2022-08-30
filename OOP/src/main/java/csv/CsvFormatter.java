package csv;

import java.util.Arrays;
import java.util.Objects;

public class CsvFormatter {
    private final String DELIMITER_PERSONS = ";";
    private final String DELIMITER_FIELD = ",";
    private final String DELIMITER_KEY_VALUE = "=";
    private final int LIMIT = 2;

    /**
     * Данный метод принимает строку представленную в формате csv
     * и возвращает массив объектов по параметрам.
     * считается что строка передается в правильном формате.
     *
     * @param csvString строка csv
     */
    public Person[] getPersonsFromCsvFile(String csvString) {
        if (Objects.isNull(csvString) || csvString.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter: csvString not be null or empty.");
        }

        String[] listOfPersons = csvString.split(DELIMITER_PERSONS);

        Person[] persons = new Person[listOfPersons.length];
        int index = 0;

        for (String person : listOfPersons) {
            String[] nameAndLastNamePersonValue = getNameAndLastNamePerson(person);

            if (nameAndLastNamePersonValue.length > 0) {
                persons[index++] = new Person(nameAndLastNamePersonValue[0], nameAndLastNamePersonValue[1]);
            }
        }

        return Arrays.copyOfRange(persons, 0, index);
    }

    /**
     * Метод принимает строку вида: "name=fieldValueName,lastname=fieldValueLastName"
     * и возвращает массив значений полей вида: [fieldValueName, fieldValueLastName].
     * Есть проверка на количество полей - должно быть 2, если не равно,
     * то метод возвращает пустой массив String[].
     *
     * @param analyzedString Строка с параметрами
     * @return String[]
     */
    private String[] getNameAndLastNamePerson(String analyzedString) {
        String[] nameAndLastNamePerson = analyzedString.split(DELIMITER_FIELD);
        int nameAndLastNamePersonLength = nameAndLastNamePerson.length;

        if (nameAndLastNamePersonLength != LIMIT) {
            return new String[0];
        }

        String[] nameAndLastNamePersonValue = new String[nameAndLastNamePersonLength];

        for (int i = 0; i < nameAndLastNamePersonLength; i++) {
            int index = nameAndLastNamePerson[i].indexOf(DELIMITER_KEY_VALUE);
            nameAndLastNamePersonValue[i] = nameAndLastNamePerson[i].substring(index + 1);
        }

        return nameAndLastNamePersonValue;
    }
}