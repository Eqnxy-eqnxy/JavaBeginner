package Java.Basic;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int num1 = scan.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scan.nextInt();
        System.out.print("Введите действие ‘+’, ‘-’, ‘*’ или ‘/’ : ");
        char action = scan.next().charAt(0);

        switch (action) {

            case '+':
                System.out.println("Результат: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Результат: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Результат: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Результат: " + (num1 / num2));
                break;
        }
    }
}


/*
Напишите простой калькулятор:

1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’

2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.
 */