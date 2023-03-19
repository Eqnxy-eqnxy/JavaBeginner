package Java.Basic;

import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int x = scan.nextInt();
        System.out.print("Введите второе число: ");
        int y = scan.nextInt();
        System.out.print("Введите третье число: ");
        int z = scan.nextInt();

        float [] MyNums = {x, y, z};
        float res = 0;
         for(float i : MyNums) {
             res += i;
         }
        float qwe = (float) Math.floor((res/MyNums.length)/2);

        System.out.println("Среднее арифметичское этих чисел: " + res/MyNums.length);
        System.out.println("Разделим среднее арифметичское этих чисел на 2 и округлим в меньшую сторну: " + qwe);

        if (qwe > 3) {
            System.out.println("Программа выполнена корректно");
        }

    }

}