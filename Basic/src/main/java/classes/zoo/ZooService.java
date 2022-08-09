package classes.zoo;

/**
 * Сервис по работе с зоопарками
 */
public class ZooService {

    /**
     * Данный метод определяет из общего количества зоопарков среднюю стоимость билета
     *
     * @param zoos все (массив) зоопарки
     * @return средняя стоимость билета
     */
    public static double getAverageTicketPrice(Zoo[] zoos) {
        if (zoos == null) {
            return 0.00;
        }

        int numberZoos = zoos.length;
        if (numberZoos == 0 || zoos[0] == null) {
            return 0.00;
        }

        double sumOfAllPrices = 0.00;
        for (Zoo zoo : zoos) {
            sumOfAllPrices += zoo.getTicketPrice();
        }

        return Math.round((sumOfAllPrices / numberZoos) * 100) / 100.0;
    }

    /**
     * Метод находит самый большой зоопарк (по количеству в нем животных) и возвращает его название,
     * если таковых несколько, то возвращается первый найденный. Если в массиве один зоопарк, то независимо
     * от количества животных в нем, метод вернет название этого единственного зоопарка.
     *
     * @param zoos все (массив) зоопарки
     * @return название самого большого зоопарка
     */
    public static String getBiggestZoo(Zoo[] zoos) {
        if (zoos == null || zoos.length == 0 || zoos[0] == null) {
            return "";
        } else {
            int maxNumberOfAnimalsInZoo = 0;
            String nameOfLargesZoo = zoos[0].getName();

            for (Zoo zoo : zoos) {
                int numberOfAnimalsInZoo = zoo.getAnimals().length;

                if (numberOfAnimalsInZoo > maxNumberOfAnimalsInZoo) {
                    maxNumberOfAnimalsInZoo = numberOfAnimalsInZoo;
                    nameOfLargesZoo = zoo.getName();
                }
            }

            return nameOfLargesZoo;
        }
    }
}