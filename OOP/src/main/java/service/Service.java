package service;

public class Service {
    private final String SPACE_DELIMITER = " ";
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void getOnlyName() {
        for (String string : repository.findAll()) {
            System.out.println(string.split(SPACE_DELIMITER)[0]);
        }
    }
}