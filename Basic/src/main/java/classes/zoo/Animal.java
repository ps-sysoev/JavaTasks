package classes.zoo;

public class Animal {
    private final String name;
    private int age;

    public Animal(String name, int age) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Incorrect parameter: name is empty");
        }

        if (age < 0) {
            throw new IllegalArgumentException("Incorrect parameter: age < 0");
        }

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Incorrect parameter: age < 0");
        }

        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}