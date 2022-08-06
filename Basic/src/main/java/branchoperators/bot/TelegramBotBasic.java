package branchoperators.bot;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Базовые элементы бота
 */

public class TelegramBotBasic {
    public static void main(String[] args) throws IOException {
        // Данный код мы вообще никак не трогаем. Просто смотрим и любуемся им.
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int number;

            try {
                number = Integer.parseInt(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.println("Enter number please.. only number =). And not big.");
                bufferedReader.close();

                break;
            }

            if (number == 1) {
                System.out.println("Hello");
            } else if (number == 2) {
                System.out.println("Buy");
            } else if (number == 3) {
                System.out.println("What???");
            } else {
                System.out.println("I don't understand you, I'm turning off");
                bufferedReader.close();

                break;
            }
        }
    }
}