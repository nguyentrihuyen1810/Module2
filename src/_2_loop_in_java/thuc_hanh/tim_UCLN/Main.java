package _2_loop_in_java.thuc_hanh.tim_UCLN;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter a: ");
        a = scanner.nextInt();

        System.out.println("Enter b: ");
        b = scanner.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest commin factor: " + a);
    }
}
