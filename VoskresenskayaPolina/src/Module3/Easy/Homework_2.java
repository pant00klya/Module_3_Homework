package Module3.Easy;

import java.util.Scanner;

public class Homework_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число a: ");
        double a = scanner.nextDouble();
        System.out.println("Введите вещественнное число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введите вещественнное число с: ");
        double c = scanner.nextDouble();
        double sum = a + b + c;
        double mult = a * b * c;
        System.out.println("Сумма a, b, c = "+ sum + " Произведение a, b, c = "+ mult);
    }
}
