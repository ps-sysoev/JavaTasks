package classes.auto;

import java.util.Arrays;

/**
 * Сервис по работе с автомобилями
 */
public class AutoService {

    /**
     * Метод возвращает автомобили заданной модели (параметр model) из массива автомобилей
     *
     * @param model заданная модель автомобиля
     * @param autos массив автомобилей
     * @return найденный массив автомобилей заданной марки
     */
    public static Auto[] getSpecificCarModel(String model, Auto[] autos) {
        if (model == null ||
                model.isEmpty() ||
                model.equals(" ") ||
                autos == null ||
                autos.length == 0 ||
                autos[0] == null) {

            return new Auto[0];
        }

        Auto[] tempAutos = new Auto[autos.length];
        int i = 0;

        for (Auto car : autos) {
            if (car.getModel().toLowerCase().contains(model.toLowerCase())) {
                tempAutos[i++] = car;
            }
        }

        return Arrays.copyOfRange(tempAutos, 0, i);
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     *
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public static Auto[] getSportCars(Auto[] autos) {
        if (autos == null ||
                autos.length == 0 ||
                autos[0] == null) {

            return new Auto[0];
        }

        Auto[] tempAutos = new Auto[autos.length];
        int i = 0;

        for (Auto car : autos) {
            if (car.getNumberOfPassengerSeats() == 2) {
                tempAutos[i++] = car;
            }
        }

        return Arrays.copyOfRange(tempAutos, 0, i);
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     *
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public static Auto[] getOnlyAutomaticTypeCars(Auto[] autos) {
        if (autos == null ||
                autos.length == 0 ||
                autos[0] == null) {

            return new Auto[0];
        }

        Auto[] tempAutos = new Auto[autos.length];
        int i = 0;

        for (Auto car : autos) {
            if (car.getTransmissionType().equalsIgnoreCase("AT")) {
                tempAutos[i++] = car;
            }
        }

        return Arrays.copyOfRange(tempAutos, 0, i);
    }
}