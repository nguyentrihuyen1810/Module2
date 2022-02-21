package BaiTap.Cong_Nhan_2_so_trg_JV;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the second number: ");
        int number2 = Integer.parseInt(scanner.nextLine());

        int multiply = number1 * number2;

        System.out.println("The quotient of two numbers " + number1 + " and " + number2 + " is: " + multiply);
    }
}
