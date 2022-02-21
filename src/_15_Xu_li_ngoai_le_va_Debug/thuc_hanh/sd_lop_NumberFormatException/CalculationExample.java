package _15_Xu_li_ngoai_le_va_Debug.thuc_hanh.sd_lop_NumberFormatException;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập x: ");
        int x = scanner.nextInt();

        System.out.println("Nhập y: ");
        int y = scanner.nextInt();

        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);
    }

    private void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("x + y = " + a);
            System.out.println("x - y = " + b);
            System.out.println("x * y = " + c);
            System.out.println("x / y = " + d);
        } catch (Exception e) {
            System.out.println("Xảy ra ngoại tệ: " + e.getMessage());
        }
    }
}
