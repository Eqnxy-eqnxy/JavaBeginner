package Java.Basic;

import java.util.Scanner;

public class Cycle3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int l = scanner.nextInt();
        double[] array = new double[l];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < l; i++) {
            array[i] = scanner.nextInt();
        }

        double res = 0;
        for(double i : array) {
            res += i;
        }

        double m = res / array.length;
        System.out.println("Среднее арифметичское этих чисел: " + m);

        for (int i = 0; i < l; i++) {
            double res2 = array[i] * m;
            System.out.println("Умножаем каждый елемент массива на среднее арифметическое: " + res2);
        }


    }

}