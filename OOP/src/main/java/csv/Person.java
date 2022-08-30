package csv;

import java.util.Objects;

public class Person {
    private final String name;
    private final String lastname;

    public Person(String name, String lastname) {
        if (Objects.isNull(name) || name.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter: name not be null or empty.");
        }

        if (Objects.isNull(lastname) || lastname.equals("")) {
            throw new IllegalArgumentException("Incorrect parameter: lastName not be null or empty.");
        }

        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;

        return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}