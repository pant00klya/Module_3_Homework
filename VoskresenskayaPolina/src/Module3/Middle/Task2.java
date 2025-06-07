package Module3.Middle;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для переменной а: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение для переменной b: ");
        int b = scanner.nextInt();
        System.out.println("Введите значение для переменной c: ");
        int c = scanner.nextInt();
        int D = b*b-4*a*c;
        System.out.println("Дискриминант равен: " +D);
    }
}
