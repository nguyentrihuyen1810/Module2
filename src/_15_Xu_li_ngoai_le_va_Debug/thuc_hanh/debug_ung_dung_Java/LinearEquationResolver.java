package _15_Xu_li_ngoai_le_va_Debug.thuc_hanh.debug_ung_dung_Java;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập c: ");
        double c = Double.parseDouble(scanner.nextLine());

        if(a != 0) {
            double solution = -b/a;
        } else {
            if (b == 0) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
