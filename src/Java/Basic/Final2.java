package Java.Basic;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите уравнение в формате 'ax+b=c', где x - неизвестное: ");
        String equation = scanner.nextLine();

        int xIndex = equation.indexOf('x');
        char sign = equation.charAt(xIndex - 1);

        String[] parts = equation.split("=");
        int constant, coefficient;
        if (xIndex == 0) {
            coefficient = 1;
        } else if (xIndex == 1 && sign == '-') {
            coefficient = -1;
        } else {
            coefficient = Integer.parseInt(equation.substring(0, xIndex - 1));
        }
        constant = Integer.parseInt(parts[1]) - Integer.parseInt(parts[0].substring(xIndex + 1));

        double x = (double) constant / coefficient;

        System.out.println("Значение x: " + x);
    }
}