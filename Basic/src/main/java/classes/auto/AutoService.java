package classes.auto;

import java.util.ArrayList;
import java.util.List;

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
    public static List<Auto> getSpecificCarModel(String model, List<Auto> autos) {
        if (model == null || model.isEmpty() || model.equals(" ") ||
                autos == null || autos.size() == 0 || autos.get(0) == null) {

            return List.of();
        }

        List<Auto> tempAutos = new ArrayList<>();

        for (Auto car : autos) {
            if (car.getModel().toLowerCase().contains(model.toLowerCase())) {
                tempAutos.add(car);
            }
        }

        return tempAutos;
    }

    /**
     * Принято считать что если автомобиль двух-местный, то он из спорт-класса
     * Данный метод возвращает автомобили спорт-класса
     *
     * @param autos все автомобили
     * @return автомобили спорт-класса
     */
    public static List<Auto> getSportCars(List<Auto> autos) {
        if (autos == null || autos.size() == 0 || autos.get(0) == null) {
            return List.of();
        }

        List<Auto> tempAutos = new ArrayList<>();

        for (Auto car : autos) {
            if (car.getNumberOfPassengerSeats() == 2) {
                tempAutos.add(car);
            }
        }

        return tempAutos;
    }

    /**
     * Данный метод возвращает автомобили только с автоматической коробкой передач
     *
     * @param autos все автомобили
     * @return автомобили с автоматической коробкой передач.
     */
    public static List<Auto> getOnlyAutomaticTypeCars(List<Auto> autos) {
        if (autos == null || autos.size() == 0 || autos.get(0) == null) {
            return List.of();
        }

        List<Auto> tempAutos = new ArrayList<>();

        for (Auto car : autos) {
            if (car.getTransmissionType().equalsIgnoreCase("AT")) {
                tempAutos.add(car);
            }
        }

        return tempAutos;
    }
}