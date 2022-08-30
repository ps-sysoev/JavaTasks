package service;

public class DataBaseRepository implements Repository {

    @Override
    public String[] findAll() {
        return new String[]{"index=1;Nikita Nesterenko", "index=2;Danila Orbanin", "index=3;Andrey Zaikovich"};
    }
}