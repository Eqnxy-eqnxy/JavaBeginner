package Java.Basic;

import java.util.Scanner;

public class Final2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String input = scanner.nextLine();

        int dl = input.length();  //длинна строки
        int posx = input.indexOf('x'); //где х
        char op = input.charAt(1);   // + или -
        char equals = input.charAt(3); // равно

        char zn1 = input.charAt(0);     //1 число или х
        int pzn1 = Character.getNumericValue(zn1); //преобразуем в int

        char zn2 = input.charAt(2);
        int pzn2 = Character.getNumericValue(zn2);

        char zn3 = input.charAt(4);
        int pzn3 = Character.getNumericValue(zn3);

        int result;

        if (dl==5 && equals == '=' && (op == '+' || op == '-')) {
            if (op == '+' && posx == 0) {
                result = pzn3 - pzn2;
            } else if (op == '+' && posx == 2) {
                result = pzn3 - pzn1;
            } else if (op == '+' && posx == 4) {
                result = pzn1 + pzn2;
            } else if (op == '-' && posx == 0) {
                result = pzn3 + pzn2;
            } else if (op == '-' && posx == 2) {
                result = pzn1 - pzn3;
            } else {
                result = pzn1 - pzn2;
            }
            System.out.println("x = " + result);
        } else
            System.out.println("Некорректное уравнение");
    }
}