package branchoperators.movie;

/**
 * Сервис доступа в кинотеатр.
 */
public class MovieAccessService {
    /**
     * Данный метод вовзращает строку уведомляющую о правах доступа в кинотеатр.
     *
     * @param age возраст посетителя
     * @return строка с правами доступа.
     */
    public static String accessMovie(int age) {
        if (age <= 0) {
            return "Incorrect age, check the user with this age.";
        } else if (age >= 18 && age <= 21) {
            return "Rating R. Access is allowed.";
        } else if (age > 21) {
            return "Rating F. Access is allowed.";
        } else {
            return "Access is denied";
        }
    }
}