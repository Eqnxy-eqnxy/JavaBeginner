package Java.Basic;

public class Array {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int lastNum = numbers[numbers.length-1];

        int temp = numbers[0];
        numbers[0]=lastNum;
        lastNum = temp;

        int summ = numbers[0] + lastNum;

        System.out.println("Первое значение массива: " + numbers[0] + ", Последнее значение массива: " + lastNum);
        System.out.println("Сумма: " + summ);

    }
}