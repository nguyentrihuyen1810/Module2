package _15_Xu_li_ngoai_le_va_Debug.bai_tap.sd_lop_IllegalTriangleException;

import java.util.Scanner;

public class TriangExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập canh a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập cạnh b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập cạnh c: ");
        double c = Double.parseDouble(scanner.nextLine());

        TriangExample triangle = new TriangExample();
        triangle.check(a, b, c);
    }

    private void check (double a, double b, double c) {
        try {
            if (a < 0 || b < 0 || c < 0 || a + b < c || a + c < b || b + c < a) {
                System.out.println("Các cạnh không phù hợp!");
            }
        } catch (Exception e){
            System.out.println("Xảy ra ngoại tệ");
        }
    }
}
