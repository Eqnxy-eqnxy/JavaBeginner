package Java.Basic;

import java.util.Scanner;

public class Final4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attemptsLeft = 3;
        boolean hintUsed = false;
        String riddle = "Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает";
        String answer = "Заархивированный вирус";

        while (attemptsLeft > 0) {
            System.out.println("Осталось попыток: " + attemptsLeft);
            System.out.print("Введите ответ: ");
            String userInput = scanner.nextLine().trim().toLowerCase();

            if (userInput.equals(answer.toLowerCase())) {
                System.out.println("Правильно!");
                return;
            } else if (userInput.equals("подсказка") && !hintUsed && attemptsLeft == 3) {
                System.out.println("Вирус");
                hintUsed = true;
            } else if (userInput.equals("подсказка") && (hintUsed || attemptsLeft < 3)) {
                System.out.println("Подсказка уже недоступна");
            } else {
                System.out.println("Подумай еще!");
                attemptsLeft--;
                if (attemptsLeft == 0) {
                    System.out.println("Обидно, приходи в другой раз");
                }
            }
        }
    }
}