package _01_introduction_to_java.thuc_hanh.giai_pt_bac_nhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter a: ");
        a = scanner.nextDouble();

        System.out.println("Enter b: ");
        b = scanner.nextDouble();

        System.out.println("Enter a: ");
        c = scanner.nextDouble();

        if (a != 0) {
            double answer = (c - b) / a;
            System.out.println("Enquation pass with x = " + answer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
