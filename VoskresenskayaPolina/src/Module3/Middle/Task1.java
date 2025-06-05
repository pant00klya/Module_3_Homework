package Module3.Middle;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество отработанных дней: ");
        int days = scanner.nextInt();
        System.out.println("Введите Вашу зарплату за один рабочий день: ");
        double salary = scanner.nextDouble();
        double monthly = days * salary;
        System.out.println("Ваша зарплата за месяц составляет: "+ monthly);

    }
}
