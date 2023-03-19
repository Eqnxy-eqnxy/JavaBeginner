package Java.Basic;

import java.util.Scanner;

public class Final1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текущий курс доллара (в рублях): ");
        float dol = scan.nextFloat();
        System.out.print("Количество рублей: ");
        int rub = scan.nextInt();

        float res = rub / dol;

        System.out.printf("Итого: %.2f долларов.", res);

    }

}
