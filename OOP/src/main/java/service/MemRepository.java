package service;

public class MemRepository implements Repository {
    @Override
    public String[] findAll() {
        return new String[]{"Nikita Nesterenko", "Danila Orbanin", "Andrey Zaikovich"};
    }
}