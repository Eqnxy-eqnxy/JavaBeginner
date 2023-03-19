package Java.Basic;

import java.util.Scanner;

public class Cycle1 {

    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        int z = 3;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int l = scanner.nextInt();

        int[] array = new int[l];

        System.out.println("Введите элементы массива:");

        for (int i = 0; i < l; i++) {
            array[i] = scanner.nextInt();
        }

        boolean hasX = false;
        boolean hasY = false;
        boolean hasZ = false;

        for (int i = 0; i < l; i++) {
            if (array[i] == x) {
                hasX = true;
            }
            if (array[i] == y) {
                hasY = true;
            }
            if (array[i] == z) {
                hasZ = true;
            }
        }

        if (hasX || hasY || hasZ) {
            System.out.println("Данное значение имеется в константах");
        } else {
            System.out.println("Ни одно значение массива не совпадает с константами");
        }
    }
}