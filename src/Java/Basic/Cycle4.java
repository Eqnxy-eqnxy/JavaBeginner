package Java.Basic;

import java.util.Scanner;

public class Cycle4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Введите элементы матрицы:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Первая строка матрицы, умноженная на 3: ");

        for (int j = 0; j < cols; j++) {
            System.out.print(matrix[0][j] * 3 + " ");
        }
    }
}