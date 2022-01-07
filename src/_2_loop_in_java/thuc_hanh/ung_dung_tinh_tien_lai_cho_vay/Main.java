package _2_loop_in_java.thuc_hanh.ung_dung_tinh_tien_lai_cho_vay;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        double money;
        double interestRate;
        double total = 0;

        System.out.println("Enter investment amount: ");
        money = scanner.nextDouble();

        System.out.println("Enter number of months: ");
        month = scanner.nextInt();

        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = scanner.nextDouble();

        for (int i = 0; i < month; i++) {
            total += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: " + total);
    }
}
