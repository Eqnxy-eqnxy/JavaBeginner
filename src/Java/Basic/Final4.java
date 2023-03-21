package Java.Basic;

import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "Заархивированный вирус";
        System.out.println("Отгадайте загадку: Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");
        int attempts = 1;
        boolean hintused = false;


        while (attempts <= 3) {
            System.out.println(attempts);
            String userInput = scanner.nextLine();


            if (userInput.equalsIgnoreCase(answer)) {
                System.out.println("Правильно!");
                return;
            } else if (attempts == 1 && userInput.equalsIgnoreCase("подсказка")) {
                System.out.println("Вирус");
                attempts++;
                hintused = true;                
            } else if (attempts > 1 && userInput.equalsIgnoreCase("подсказка")) {
                System.out.println("Подсказка недоступна");
                attempts++;
            } else if (attempts == 3 || (attempts == 2 && hintused && !userInput.equalsIgnoreCase(answer))) {
                System.out.println("Обидно, приходи в другой раз");
                return;
            } else {
                System.out.println("Подумайте еще!");
                attempts++;
            }
        }
    }
}