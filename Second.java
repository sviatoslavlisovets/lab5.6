import java.util.Scanner;

public class Second {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть двозначне число: ");
        int number = scanner.nextInt();

        if(number < 10 || number > 99) {
            System.out.println("Введене число не є двозначним.");
            return;
        }

        int firstDigit = number / 10;
        int secondDigit = number % 10;
        int sum = firstDigit + secondDigit;
        System.out.println("Сума цифр двозначного числа " + number + " дорівнює " + sum + ".");
    }
}