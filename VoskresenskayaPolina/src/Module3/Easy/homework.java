package Module3.Easy;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значение для а: ");
        int a = scanner.nextInt();
        System.out.println("Введите значение для b: ");
        int b = scanner.nextInt();
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Пользователь ввел значение для a: " + a + " и b: "+ b );
    }
}
