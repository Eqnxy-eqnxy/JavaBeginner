package Java.Basic;

import java.util.Scanner;

public class Cycle2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое положительно число: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Сумма нечетных чисел от 1 до " + n + " равна " + sum);

    }

}