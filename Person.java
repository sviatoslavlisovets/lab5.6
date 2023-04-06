import java.util.Scanner;

public class Person {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть дробове число: ");
        double number = scanner.nextDouble();

        int rounded = (int) Math.round(number);
        System.out.println("Округлене значення числа " + number + " до найближчого цілого дорівнює " + rounded + ".");
    }
}