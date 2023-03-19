package Java.Basic;

import java.util.Scanner;

public class Data3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                System.out.println(word);
                count++;
            }
        }

        System.out.println("Количество слов, состоящих только из латиницы: " + count);
    }
}