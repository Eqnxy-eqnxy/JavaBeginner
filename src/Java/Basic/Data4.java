package Java.Basic;

import java.util.Arrays;
import java.util.Random;

public class Data4 {

    public static void main(String[] args) {

        int[] arr = new int[15];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(41) - 20;
        }
        System.out.println(Arrays.toString(arr));


        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);


        int absMax = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю значение: " + absMax);
    }
}