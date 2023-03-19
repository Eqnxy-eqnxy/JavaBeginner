package Java.Basic;

import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - фунт, 3 - унция");
            int unit = scanner.nextInt();

            System.out.println("Введите количество выбранных единиц:");
            double value = scanner.nextDouble();

            double kilograms = 0;
            double pounds = 0;
            double ounces = 0;

            switch (unit) {
                case 1:
                    kilograms = value;
                    pounds = value * 2.20462;
                    ounces = value * 35.274;
                    break;
                case 2:
                    pounds = value;
                    kilograms = value * 0.453592;
                    ounces = value * 16;
                    break;
                case 3:
                    ounces = value;
                    pounds = value * 0.0625;
                    kilograms = value * 0.0283495;
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения!");
                    System.exit(0);
            }

            System.out.println("Результат:");
            System.out.println("Килограммы: " + kilograms);
            System.out.println("Фунты: " + pounds);
            System.out.println("Унции: " + ounces);
        } else if (choice == 2) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int unit = scanner.nextInt();

            System.out.println("Введите количество выбранных единиц:");
            double value = scanner.nextDouble();

            double meters = 0;
            double miles = 0;
            double yards = 0;
            double feet = 0;

            switch (unit) {
                case 1:
                    meters = value;
                    miles = value * 0.000621371;
                    yards = value * 1.09361;
                    feet = value * 3.28084;
                    break;
                case 2:
                    miles = value;
                    meters = value * 1609.34;
                    yards = value * 1760;
                    feet = value * 5280;
                    break;
                case 3:
                    yards = value;
                    meters = value * 0.9144;
                    miles = value * 0.000568182;
                    feet = value * 3;
                    break;
                case 4:
                    feet = value;
                    meters = value * 0.3048;
                    miles = value * 0.000189394;
                    yards = value * 0.333333;
                    break;
                default:
                    System.out.println("Неверный выбор единицы измерения!");
                    System.exit(0);
            }

            System.out.println("Результат:");
            System.out.println("Метры: " + meters);
            System.out.println("Мили: " + miles);
            System.out.println("Ярды: " + yards);
            System.out.println("Футы: " + feet);

        }
    }
}
