package Java.Basic;

import java.util.Scanner;

public class Final3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String maxString = "";
        long maxCount = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i+1) + ": ");
            String input = scanner.nextLine();
            long count = countDistinct(input);
            if (count > maxCount) {
                maxCount = count;
                maxString = input;
            }
        }

        System.out.println("Ответ: " + maxString);
    }

    public static long countDistinct(String str) {
        long count = 0;
        for (int i = 0; i < str.length(); i++)
            count = str.chars().distinct().count();
        return count;
        }
    }