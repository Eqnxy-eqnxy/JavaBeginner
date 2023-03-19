package Java.Basic;

import java.util.Scanner;

public class Data1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String num1Str = scanner.nextLine();

        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        int num1 = Integer.parseInt(num1Str);

        if (num1 > num2) {
            System.out.println("Большее число: " + num1);
            System.out.println("Меньшее число: " + (double) num2);
        } else {
            System.out.println("Большее число: " + num2);
            System.out.println("Меньшее число: " + (double) num1);
        }
    }
}